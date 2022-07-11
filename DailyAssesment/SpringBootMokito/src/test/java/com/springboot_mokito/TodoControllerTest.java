package com.springboot_mokito;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestContext;
import org.springframework.test.context.web.WebAppConfiguration;

RunWith(SpringJUnit4ClassRunner.class)

@ContextConfiguration(classes = { TestContext.class, WebAppContext.class })
@WebAppConfiguration
public class TodoControllerTest {

	private MockMvc mockMvc;
	@Autowired
	private TodoService todoServiceMock;

	// Add WebApplicationContext field here.
	// The setUp() method is omitted.
	@Test
	public void findAll_TodosFound_ShouldReturnFoundTodoEntries() throws Exception {
		Todo first = new TodoBuilder().id(1L).description("Lorem ipsum").title("Foo").build();
		Todo second = new TodoBuilder().id(2L).description("Lorem ipsum").title("Bar").build();
		when(todoServiceMock.findAll()).thenReturn(Arrays.asList(first, second));
		mockMvc.perform(get("/api/todo")).andExpect(status().isOk())
				.andExpect(content().contentType(TestUtil.APPLICATION_JSON_UTF8)).andExpect(jsonPath("$", hasSize(2)))
				.andExpect(jsonPath("$[0].id", is(1))).andExpect(jsonPath("$[0].description", is("Lorem ipsum")))
				.andExpect(jsonPath("$[0].title", is("Foo"))).andExpect(jsonPath("$[1].id", is(2)))
				.andExpect(jsonPath("$[1].description", is("Lorem ipsum")))
				.andExpect(jsonPath("$[1].title", is("Bar")));
		verify(todoServiceMock, times(1)).findAll();
		verifyNoMoreInteractions(todoServiceMock);
	}

	@Test
	public void findById_TodoEntryNotFound_ShouldReturnHttpStatusCode404() throws Exception {
		when(todoServiceMock.findById(1L)).thenThrow(new TodoNotFoundException(""));
		mockMvc.perform(get("/api/todo/{id}", 1L)).andExpect(status().isNotFound());
		verify(todoServiceMock, times(1)).findById(1L);
		verifyNoMoreInteractions(todoServiceMock);
	}

	@Test
	public void findById_TodoEntryFound_ShouldReturnFoundTodoEntry() throws Exception {
		Todo found = new TodoBuilder().id(1L).description("Lorem ipsum").title("Foo").build();
		when(todoServiceMock.findById(1L)).thenReturn(found);
		mockMvc.perform(get("/api/todo/{id}", 1L)).andExpect(status().isOk())
				.andExpect(content().contentType(TestUtil.APPLICATION_JSON_UTF8)).andExpect(jsonPath("$.id", is(1)))
				.andExpect(jsonPath("$.description", is("Lorem ipsum"))).andExpect(jsonPath("$.title", is("Foo")));
		verify(todoServiceMock, times(1)).findById(1L);
		verifyNoMoreInteractions(todoServiceMock);
	}

	@Test
	public void add_TitleAndDescriptionAreTooLong_ShouldReturnValidationErrorsForTitleAndDescription()
			throws Exception {
		String title = TestUtil.createStringWithLength(101);
		String description = TestUtil.createStringWithLength(501);
		TodoDTO dto = new TodoDTOBuilder().description(description).title(title).build();
		mockMvc.perform(post("/api/todo").contentType(TestUtil.APPLICATION_JSON_UTF8)
				.content(TestUtil.convertObjectToJsonBytes(dto))).andExpect(status().isBadRequest())
				.andExpect(content().contentType(TestUtil.APPLICATION_JSON_UTF8))
				.andExpect(jsonPath("$.fieldErrors", hasSize(2)))
				.andExpect(jsonPath("$.fieldErrors[*].path", containsInAnyOrder("title", "description")))
				.andExpect(jsonPath("$.fieldErrors[*].message",
						containsInAnyOrder("The maximum length of the description is 500 characters.",
								"The maximum length of the title is 100 characters.")));
		verifyZeroInteractions(todoServiceMock);
	}

	@Test
	public void add_NewTodoEntry_ShouldAddTodoEntryAndReturnAddedEntry() throws Exception {
		TodoDTO dto = new TodoDTOBuilder().description("description").title("title").build();
		Todo added = new TodoBuilder().id(1L).description("description").title("title").build();
		when(todoServiceMock.add(any(TodoDTO.class))).thenReturn(added);
		mockMvc.perform(post("/api/todo").contentType(TestUtil.APPLICATION_JSON_UTF8)
				.content(TestUtil.convertObjectToJsonBytes(dto))).andExpect(status().isOk())
				.andExpect(content().contentType(TestUtil.APPLICATION_JSON_UTF8)).andExpect(jsonPath("$.id", is(1)))
				.andExpect(jsonPath("$.description", is("description"))).andExpect(jsonPath("$.title", is("title")));
		ArgumentCaptor<TodoDTO> dtoCaptor = ArgumentCaptor.forClass(TodoDTO.class);
		verify(todoServiceMock, times(1)).add(dtoCaptor.capture());
		verifyNoMoreInteractions(todoServiceMock);
		TodoDTO dtoArgument = dtoCaptor.getValue();
		assertNull(dtoArgument.getId());
		assertThat(dtoArgument.getDescription(), is("description"));
		assertThat(dtoArgument.getTitle(), is("title"));
	}

}

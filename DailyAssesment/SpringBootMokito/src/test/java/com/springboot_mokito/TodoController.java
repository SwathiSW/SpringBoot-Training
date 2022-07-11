package com.springboot_mokito;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TodoController {

	private TodoService service;

	@RequestMapping(value = "/api/todo", method = RequestMethod.GET)
	@ResponseBody
	public List<TodoDTO> findAll() {
		List<Todo> models = service.findAll();
		return createDTOs(models);
	}

	@RequestMapping(value = "/api/todo/{id}", method = RequestMethod.GET) //Added Later 1 time
	@ResponseBody
	public TodoDTO findById(@PathVariable("id") Long id) throws TodoNotFoundException {
		Todo found = service.findById(id);
		return createDTO(found);
	}

	@RequestMapping(value = "/api/todo", method = RequestMethod.POST) // Added Later 2 time
	@ResponseBody
	public TodoDTO add(@Valid @RequestBody TodoDTO dto) {
		Todo added = service.add(dto);
		return createDTO(added);
	}

	private TodoDTO createDTO(Todo model) {
		TodoDTO dto = new TodoDTO();
		dto.setId(model.getId());
		dto.setDescription(model.getDescription());
		dto.setTitle(model.getTitle());
		return dto;
	}

	private List<TodoDTO> createDTOs(List<Todo> models) {
		List<TodoDTO> dtos = new ArrayList<>();
		for (Todo model : models) {
			dtos.add(createDTO(model));
		}
		return dtos;
	}

	private TodoDTO createDTO(Todo model) {
		TodoDTO dto = new TodoDTO();
		dto.setId(model.getId());
		dto.setDescription(model.getDescription());
		dto.setTitle(model.getTitle());
		return dto;
	}
}

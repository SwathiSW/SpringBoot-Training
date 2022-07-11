package com.springboot_controller_test_demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class SpringBootControllerTestDemoApplicationTests {

	@Autowired
	private Controller controller = new Controller();
	@Autowired
	private MyService myService;

	@Test
	public void controllerTesting() {
		assertEquals("hello World", controller.greeting());
	}

	@Test
	public void myEmployeeControllerTesting() {
		Employee employee = new Employee();
		assertEquals("done", controller.addRecord(employee));
	}

	@Test
	public void myEmployeeServiceTesting() {
		Employee employee = new Employee();
		assertEquals(employee, myService.addEmployee(employee));
	}

}

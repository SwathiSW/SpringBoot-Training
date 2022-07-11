package com.springboot_mokito;

import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class RestErrorHandler {

	private static final Logger LOGGER = LoggerFactory.getLogger(RestErrorHandler.class);

	@ExceptionHandler(TodoNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public void handleTodoNotFoundException(TodoNotFoundException ex) {
		LOGGER.debug("handling 404 error on a todo entry");
	}
}

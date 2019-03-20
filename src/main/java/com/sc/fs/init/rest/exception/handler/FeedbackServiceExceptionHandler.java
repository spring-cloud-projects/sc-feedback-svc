package com.sc.fs.init.rest.exception.handler;

import org.springframework.web.bind.annotation.ExceptionHandler;

import com.sc.fs.init.rest.exception.FeedbackServiceException;

public class FeedbackServiceExceptionHandler {

	@ExceptionHandler(value = { FeedbackServiceException.class })
	public void handleException() {

	}
}

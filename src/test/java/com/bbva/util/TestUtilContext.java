package com.bbva.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;

import com.bbva.spring.AppConfig;

public class TestUtilContext {

	private ApplicationContext context = null;
	private Environment env = null;

	public TestUtilContext() {
		super();
		context = new AnnotationConfigApplicationContext(AppConfig.class);
		env = context.getEnvironment();
	}

	public ApplicationContext getContext() {
		return context;
	}

	public Environment getEnv() {
		return env;
	}
}

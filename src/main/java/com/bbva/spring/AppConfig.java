package com.bbva.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(value="com.bbva")
@ImportResource("classpath:/spring/spring-context.xml")
@PropertySource(value="classpath:/com/bbva/properties/application.properties" , name="propertyConfigInDev")
public class AppConfig{

	public AppConfig() {
		super();
		System.out.println("Load context................................................");
	}
	
	//To resolve ${} in @Value
//	@Bean
//	public static PropertySourcesPlaceholderConfigurer propertyConfigInDev() {
//		return new PropertySourcesPlaceholderConfigurer();
//	}
	

}

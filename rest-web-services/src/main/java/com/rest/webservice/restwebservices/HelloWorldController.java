package com.rest.webservice.restwebservices;

import java.util.Locale;

import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	private MessageSource messageSource;
	
	public HelloWorldController(MessageSource messageSource) {
		this.messageSource = messageSource;
	}
	
	@RequestMapping(method = RequestMethod.GET, path = "/hello-world")
	public String helloWorld() {
		return "Hello World";
	}
	
	@GetMapping( path = "/hello-world1")
	public String helloWorld1() {
		return "Hello World1";
	}

	@GetMapping( value = "/hello-world2")
	public String helloWorld2() {
		return "Hello World2";
	}

	@GetMapping( value = "/hello-world-bean")
	public HelloBean helloWorldBean() {
		return new HelloBean("Hello World Bean");
	}
	
	//Path Parameters
	// /users/{id}/todos/{name} => /users/1/todos/test => /users/2/todos/test1
	@GetMapping( value = "/hello-world-bean/path-variable/{name}")
	public HelloBean helloWorldPathVariable(@PathVariable String name) {
		return new HelloBean("Hello World Bean, name ::  "+ name );
	}
	
	@GetMapping(path = "/hello-world-internationalized")
	public String helloWorldInternationalized() {
		Locale locale = LocaleContextHolder.getLocale();
		return messageSource.getMessage("good.morning.message", null, "Default Message", locale );
		
		//return "Hello World V2"; 
		
		//1:
		//2:
//		- Example: `en` - English (Good Morning)
//		- Example: `nl` - Dutch (Goedemorgen)
//		- Example: `fr` - French (Bonjour)
//		- Example: `de` - Deutsch (Guten Morgen)

	}
}

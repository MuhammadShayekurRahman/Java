package com.qa.may;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	


	@GetMapping("/hello")
	public String helloWorld() {
		return "Hello world!";
	}
	
	
	
	@GetMapping("/math")
	public double calc() {
		double a = 5.6;
		double b = 4.3;
		return a + b;
	}
	
	@GetMapping("/pythagoras")
	public double calcC(@PathParam("a") int a, @PathParam("b") int b) {
		double c = Math.sqrt((a*a)+(b*b));
		return c;
	}
	
	@GetMapping("/person")
	public Person person1() {
		Person muhammad = new Person("Muhammad", 23);
		return muhammad;
	}
	
	@GetMapping("/test")
	public String test() {
		return "<html><body><h1>Hello World</h1></body></html>";
	}
}

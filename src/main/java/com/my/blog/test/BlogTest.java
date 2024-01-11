package com.my.blog.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BlogTest {

	@GetMapping("/test/hello")
	public String HelloWorld()
	{
		return "<H1>Hello My First Web App</H1><p> It's awsome for me!!!!!!!!<p>show test";
	}
}

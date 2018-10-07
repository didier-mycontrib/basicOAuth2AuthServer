package org.mycontrib.example.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

//NB: @SpringBootApplication est un equivalent 
//de @Configuration + @EnableAutoConfiguration + @ComponentScan/current package


@SpringBootApplication
//implicit @Import of @Configuration found in same (sub-)package(s)
public class MyBasicAuthServerApp extends SpringBootServletInitializer {
	
	
	public static void main(String[] args) {
		SpringApplication.run(MyBasicAuthServerApp.class, args);
		System.out.println("http://localhost:8081/basic-oauth-server");
	}
	
}

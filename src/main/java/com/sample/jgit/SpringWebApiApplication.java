package com.sample.jgit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@ComponentScan
@EnableAutoConfiguration
@RestController
public class SpringWebApiApplication {
	
	@RequestMapping("/")
	public String index(){
		return "hello";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringWebApiApplication.class, args);
	}
}

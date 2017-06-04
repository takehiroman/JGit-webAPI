package com.sample.jgit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


@ComponentScan
@EnableAutoConfiguration
@RestController
public class SpringWebApiApplication {
	
	@RequestMapping("/")
	public ModelAndView index(ModelAndView mav){
		mav.setViewName("index");
		return mav;
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringWebApiApplication.class, args);
	}
}

package com.sample.jgit;

import java.io.IOException;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommandController {
	createRepository repo = new createRepository();
	
	@RequestMapping("/init")
	public String postrepo() throws IOException{
		repo.createRepo();
		return "create:"+repo.createRepo();
	}
}

package com.sample.jgit;

import java.io.IOException;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommandController {
	createRepository repo = new createRepository();
	
	@RequestMapping("/init")
	public void postrepo() throws IOException{
		System.out.println("created"+repo.createRepo());
		repo.createRepo();
		return;
	}
}

package com.sample.jgit;

import java.io.File;
import java.io.IOException;

import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.StatusCommand;
import org.eclipse.jgit.api.errors.GitAPIException;
import org.eclipse.jgit.lib.Repository;
import org.springframework.http.HttpStatus;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sample.git.InitCommand;
import com.sample.git.OpenRepository;
import com.sample.git.diffCommand;
import com.sample.git.statusCommand;

import org.springframework.web.bind.annotation.ResponseStatus;

@RestController
@RequestMapping("api")
public class CommandController {
	
	private Git git;

	@RequestMapping(value = "init",method=RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	public void postrepo() throws IOException, GitAPIException{
		
		return;
	}
	
	
	@RequestMapping(value = "init",method=RequestMethod.GET)
	public File getRepo() throws IOException, GitAPIException{
		return InitCommand.createRepo().getDirectory();
	}
	
	@RequestMapping(value = "status",method=RequestMethod.GET)
	public void getStatus() throws IOException, GitAPIException{
		statusCommand.statusRepo();
		return;
	}
	@RequestMapping(value = "diff",method=RequestMethod.GET)
	public void getDiff() throws IOException,GitAPIException{
		diffCommand.diffRepo();
		return;
	}
	
	
}

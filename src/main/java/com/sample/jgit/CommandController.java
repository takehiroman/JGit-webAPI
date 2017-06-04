package com.sample.jgit;

import java.io.File;
import java.io.IOException;

import org.eclipse.jgit.api.errors.GitAPIException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sample.git.AddCommand;
import com.sample.git.CommitCommand;
import com.sample.git.InitCommand;
import com.sample.git.DiffCommand;
import com.sample.git.StatusCommand;

@RestController
@RequestMapping("api")
public class CommandController {

	@RequestMapping(value = "init",method=RequestMethod.GET)
	public void getRepo() throws IOException, GitAPIException{
		InitCommand.createRepo();
		return;
	}
	
	@RequestMapping(value = "commit",method=RequestMethod.GET)
	public void getCommit() throws IOException, GitAPIException{
		CommitCommand.getCommit();
		return;
	}
	
	@RequestMapping(value = "add",method=RequestMethod.GET)
	public void addRepo() throws IOException, GitAPIException{
		AddCommand.addCommand();
		return;
	}
	
	@RequestMapping(value = "status",method=RequestMethod.GET)
	public void getStatus() throws  GitAPIException, IOException{
        StatusCommand.statusRepo();
		return;
	}
	
	@RequestMapping(value = "diff",method=RequestMethod.GET)
	public void getDiff() throws IOException,GitAPIException{
		DiffCommand.diffRepo();
		return;
	}
	
	
}

package com.sample.git;


import java.io.File;
import java.io.IOException;

import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.errors.GitAPIException;



public class InitCommand {
	
	public static void createRepo() throws IOException, GitAPIException {

		//File localPath = File.createTempFile("TestGitRepository", "");
		
        //localPath.delete();
        //localPath.mkdirs();
		
     // create the directory
		//カレントディレクトリを取得
		String pwd = new File(".").getAbsoluteFile().getParent();
		String localpath = pwd+"/target/test";
		//リポジトリを生成
		try (Git git = Git.init()
				.setDirectory(new File(localpath))
				.call()) {
        System.out.println("Created a new repository at " + git.getRepository().getDirectory());
        }

		
	}

}

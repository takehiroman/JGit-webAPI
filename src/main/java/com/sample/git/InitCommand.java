package com.sample.git;


import java.io.File;
import java.io.IOException;


import org.eclipse.jgit.api.errors.GitAPIException;
import org.eclipse.jgit.storage.file.FileRepositoryBuilder;
import org.eclipse.jgit.lib.Repository;


public class InitCommand {
	
	public static Repository createRepo() throws IOException, GitAPIException {

		//File localPath = File.createTempFile("TestGitRepository", "");
		
        //localPath.delete();
        //localPath.mkdirs();
		
     // create the directory
		//カレントディレクトリを取得
		String pwd = new File(".").getAbsoluteFile().getParent();
		String localpath = pwd+"/target/";
		//リポジトリを生成
        Repository repository = FileRepositoryBuilder.create(new File(localpath, "/test/.git"));
        repository.create();

        return repository;
		
	}
	public static File repoDir() throws IOException, GitAPIException{
		System.out.println(createRepo().getDirectory());
		return createRepo().getDirectory();
	}
}

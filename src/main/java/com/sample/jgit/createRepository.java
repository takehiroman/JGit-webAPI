package com.sample.jgit;

import java.io.File;
import java.io.IOException;

import org.eclipse.jgit.lib.Repository;
import org.eclipse.jgit.storage.file.FileRepositoryBuilder;

public class createRepository {
	String localPath;
	
	public Repository createRepo() throws IOException {
		File localPath = File.createTempFile("TestGitRepository", "");
		
        localPath.delete();
        localPath.mkdirs();
		
		Repository newlyCreatedRepo = FileRepositoryBuilder.create(
			    new File(localPath, ".git"));
		newlyCreatedRepo.create();
		return newlyCreatedRepo;
	}
}

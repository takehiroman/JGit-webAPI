package com.sample.git;

import java.io.IOException;

import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.errors.GitAPIException;
import org.eclipse.jgit.lib.Repository;

public class CommitCommand {
	public static void getCommit() throws IOException, GitAPIException{
		try (Repository repository = OpenRepository.openRepo()) {
            try (Git git = new Git(repository)) {
                git.commit()
                .setMessage("Added testfile")
                .call();
                
                System.out.println("Committed file to repository at " + repository.getDirectory());
            	}
            }
	}
}

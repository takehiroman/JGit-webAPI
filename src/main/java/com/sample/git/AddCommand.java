package com.sample.git;


import java.io.IOException;

import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.errors.GitAPIException;
import org.eclipse.jgit.lib.Repository;

public class AddCommand {
	public static void addCommand() throws IOException, GitAPIException {
		try (Repository repository = OpenRepository.openRepo()) {
            try (Git git = new Git(repository)) {
            	
             // run the add-call
                git.add()
                        .addFilepattern(".")
                        .call();

                System.out.println("Added file  to repository at " + repository.getDirectory());
            }
		}
	}
}

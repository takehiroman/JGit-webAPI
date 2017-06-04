package com.sample.git;

import java.io.IOException;

import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.errors.GitAPIException;
import org.eclipse.jgit.lib.Repository;

public class DiffCommand {
    public static void diffRepo() throws IOException, GitAPIException {
        try (Repository repository = OpenRepository.openRepo()) {
            try (Git git = new Git(repository)) {
            	 git.diff()
                	.setOutputStream(System.out)
                	.call();
            }
        }
    }
}

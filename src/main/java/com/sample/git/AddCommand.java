package com.sample.git;

import java.io.File;
import java.io.IOException;

import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.errors.GitAPIException;
import org.eclipse.jgit.lib.Repository;

public class AddCommand {
	public static void main(String[] args) throws IOException, GitAPIException {
		try (Repository repository = InitCommand.createRepo()) {
            try (Git git = new Git(repository)) {
            	// addするファイルを生成
                File myfile = new File(repository.getDirectory().getParent(), "testfile");
                if(!myfile.createNewFile()) {
                    throw new IOException("Could not create file " + myfile);
            }
             // run the add-call
                git.add()
                        .addFilepattern("testfile")
                        .call();

                System.out.println("Added file " + myfile + " to repository at " + repository.getDirectory());
            }
		}
	}
}

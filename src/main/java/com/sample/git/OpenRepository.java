package com.sample.git;


import java.io.File;
import java.io.IOException;

import org.eclipse.jgit.storage.file.FileRepositoryBuilder;
import org.eclipse.jgit.lib.Repository;

public class OpenRepository {
    public static Repository openRepo() throws IOException {
    	String pwd = new File(".").getAbsoluteFile().getParent();
		String localpath = pwd+"/target/test/.git";
		
        FileRepositoryBuilder builder = new FileRepositoryBuilder();
        return builder
                .readEnvironment() // scan environment GIT_* variables
                .findGitDir(new File(localpath)) // scan up the file system tree
                .build();
    }
}

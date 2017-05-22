package com.sample.git;

import java.io.IOException;

import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.Status;
import org.eclipse.jgit.api.errors.GitAPIException;
import org.eclipse.jgit.lib.Repository;

public class statusCommand {

	    public static void statusRepo() throws IOException, GitAPIException {
	        try (Repository repository = OpenRepository.openRepo()) {
	            try (Git git = new Git(repository)) {
	                Status status = git.status().call();
	                System.out.println("Added: " + status.getAdded());
	                System.out.println("Changed: " + status.getChanged());
	                System.out.println("Conflicting: " + status.getConflicting());
	                System.out.println("ConflictingStageState: " + status.getConflictingStageState());
	                System.out.println("IgnoredNotInIndex: " + status.getIgnoredNotInIndex());
	                System.out.println("Missing: " + status.getMissing());
	                System.out.println("Modified: " + status.getModified());
	                System.out.println("Removed: " + status.getRemoved());
	                System.out.println("Untracked: " + status.getUntracked());
	                System.out.println("UntrackedFolders: " + status.getUntrackedFolders());
	            }
	        }
	    }
}

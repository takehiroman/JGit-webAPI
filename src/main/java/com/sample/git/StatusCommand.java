package com.sample.git;

import java.io.IOException;

import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.Status;
import org.eclipse.jgit.api.errors.GitAPIException;
import org.eclipse.jgit.lib.Repository;


public class StatusCommand {
			
	    public  static void statusRepo()  throws IOException, GitAPIException {
	        try (Repository repository = OpenRepository.openRepo()) {
	            try (Git git = new Git(repository)) {
	                Status status = git.status().call();
	                /*
	                ArrayList<String> statusfiles = new ArrayList<String>();
	                statusfiles.add("Added: " + status.getAdded());
	                statusfiles.add("Changed: " + status.getChanged());
	                statusfiles.add("Modified: " + status.getModified());
	                statusfiles.add("Removed: " + status.getRemoved());
	                statusfiles.add("Untracked: " + status.getUntracked());
	                */
	                for(String s: status.getModified())
	        			System.out.println("modified: "+s);
	        		for(String s: status.getChanged())
	        			System.out.println("changed: "+s);
	        		for(String s: status.getUntracked())
	        			System.out.println("untracked: "+s);
	            	for(String s: status.getAdded())
	            		System.out.println("added: "+s);
                	}
	            }
	        }
	    
}

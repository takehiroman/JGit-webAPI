package com.sample.user;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.validator.constraints.NotEmpty;

public class Command {

    @NotEmpty
    private String command = "";

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }
	
	
/*
	//private String id;
	private ArrayList<String> statusfiles;
	//private String url;
    
    public Command(String id, String string){
        //this.id = id;
        this.statusfiles = statusfiles;
        //this.url = url;
    }
    
    public String getId(){
    	return id;
    }
    
    
    public ArrayList<String> getMessage(){
    	return statusfiles;
    }
    
    public String getUrl(){
    	return url;
    }
    
    public void setId(String id){
    	this.id = id;
    }
    
    public void setMessage(ArrayList<String> statusfiles){
    	this.statusfiles = statusfiles;
    }
    
    public void setUrl(String url){
    	this.url = url;
    }
  */  
}

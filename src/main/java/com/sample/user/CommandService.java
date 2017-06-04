package com.sample.user;

import java.util.List;

public interface CommandService {
	void addCommand(String command);
	
	List<Command> getCommand();
}

package com.sample.user;

import java.util.List;
//import com.sample.user.Command;

import org.springframework.stereotype.Service;

@Service
public class CommandServiceImpl implements CommandService {
	private List<Command> commands;

	@Override
	public void addCommand(String command) {
		Command commandObj = new Command();
		commandObj.setCommand(command);
		commands.add(commandObj);
		
	}

	@Override
	public List<Command> getCommand() {
		return commands;
	}

}

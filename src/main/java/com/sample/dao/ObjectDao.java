package com.sample.dao;

import com.sample.user.Command;

public interface ObjectDao {
	public Command[] getStatus(String token);
}

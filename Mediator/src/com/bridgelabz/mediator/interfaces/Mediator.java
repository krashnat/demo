package com.bridgelabz.mediator.interfaces;

import com.bridgelab.user.User;

public interface Mediator {
	public void sendMessage(String message,User user);
	void addUser(User user);


}

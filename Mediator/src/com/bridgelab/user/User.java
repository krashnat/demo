package com.bridgelab.user;

import com.bridgelabz.mediator.interfaces.Mediator;

public abstract class User {
	protected Mediator med;
	protected String name;
	public User(Mediator med, String name) {
		super();
		this.med = med;
		this.name = name;
	}
	public abstract void sendMessage(String message);
	public abstract void sendRecieve(String message);
}    
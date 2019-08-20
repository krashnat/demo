package com.bridgelabz.mediator.implementation;

import com.bridgelab.user.User;
import com.bridgelabz.mediator.interfaces.Mediator;

public class UserImpl extends User {

	public UserImpl(Mediator med, String name) {
		super(med, name);
		
	}

	@Override
	public void sendMessage(String Message) {
		System.out.println(this.name+": Sending Message="+Message);
		med.sendMessage( Message, this);
		
	}

	@Override
	public void sendRecieve(String Message) {
		System.out.println(this.name+": Received Message:"+Message);
	}
		
	}



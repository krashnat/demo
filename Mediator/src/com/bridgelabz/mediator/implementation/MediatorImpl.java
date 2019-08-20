package com.bridgelabz.mediator.implementation;

import java.util.ArrayList;

import com.bridgelab.user.User;
import com.bridgelabz.mediator.interfaces.Mediator;

public class MediatorImpl implements Mediator {

	ArrayList<User> list;
	
	public MediatorImpl()
	{
		list=new ArrayList<>();
	}

	
	public void addUser(User user)
	{
		list.add(user);
	}


	public void sendMessage(String message, User user) {
		for(User user1:this.list)
		{
			if(user1.equals(user)!=true)
			{
				user1.sendMessage(message);
			}
		}
		
		
	}


	
	

	
	
}

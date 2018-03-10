package com.still.web;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.still.domain.User;
import com.still.serice.UserService;

public class UserAction extends ActionSupport implements ModelDriven<User>{



	
	private User model = new User();

	@Override
	public User getModel() {
		return model;
	}

	private Integer id;
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	private UserService userService;
	
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	
	public String findById(){
		
		model = userService.findById(model.getId());
		
		return SUCCESS;
		
	}
	
	
	
	
	
	
	
	
}

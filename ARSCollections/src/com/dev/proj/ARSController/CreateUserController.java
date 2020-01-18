package com.dev.proj.ARSController;

import java.util.List;

import com.dev.proj.ARSDAOImpl.*;
import com.dev.proj.ARSDTO.*;

import com.dev.proj.ARSService.*;
public class CreateUserController 
{
	public static void main(String[] args) {

		CreateUserService createUserService=new CreateUserService();
		List<UserDTO> dtos=createUserService.createUser();
		for (UserDTO userDTO : dtos) {
			System.out.println("UserAdded Successfully");
		}
	}
}

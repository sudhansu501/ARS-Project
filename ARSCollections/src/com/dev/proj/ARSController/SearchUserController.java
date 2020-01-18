package com.dev.proj.ARSController;

import java.util.List;

import com.dev.proj.ARSDAOImpl.*;
import com.dev.proj.ARSDTO.*;
import com.dev.proj.ARSService.SearchUserService;
public class SearchUserController {

	public static void main(String[] args) {
		SearchUserService searchUserService=new SearchUserService();
		UserDTO user= searchUserService.searchUser();


		if(user!=null)
		{
			System.out.println(user);
		}
		else
		{
			System.out.println("User Not found");
		}



	}
}


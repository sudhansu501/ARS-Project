package com.dev.proj.ARSController;

import java.util.List;

import com.dev.proj.ARSDAOImpl.*;
import com.dev.proj.ARSDTO.*;
import com.dev.proj.ARSService.DeleteUserService;
public class DeleteUserController {

	public static void main(String[] args) {
		DeleteUserService deleteUserService=new DeleteUserService();
		boolean res=deleteUserService.deleteUser();
		
		if(res)
		{
			System.out.println("Deleted");
		}
		else
		{
			System.out.println("Not deleted");
		}
		}
	
}

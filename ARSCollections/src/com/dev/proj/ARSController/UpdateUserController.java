package com.dev.proj.ARSController;

import java.util.List;

import com.dev.proj.ARSDAOImpl.*;
import com.dev.proj.ARSDTO.*;
import com.dev.proj.ARSService.UpdateUserService;
public class UpdateUserController {

	public static void main(String[] args) {
		UpdateUserService service=new UpdateUserService();
		UserDTO dtos=service.updateUser();
		
			if(dtos!=null)
			{
			System.out.println(dtos);
			}
			else
			{
				System.out.println("No user Found");
			}
		}
	}


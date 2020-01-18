package com.dev.proj.ARSService;

import java.util.List;

import com.dev.proj.ARSDTO.*;
import com.dev.proj.ARSController.*;
import com.dev.proj.ARSDAOImpl.DaoImpl;
public class CreateUserService {

	public List<UserDTO> createUser()
	{
		List<UserDTO> dtos=DaoImpl.createUser();
		return dtos;
	}

}

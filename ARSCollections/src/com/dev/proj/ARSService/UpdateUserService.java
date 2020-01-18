package com.dev.proj.ARSService;

import java.util.List;

import com.dev.proj.ARSDAOImpl.DaoImpl;
import com.dev.proj.ARSDTO.UserDTO;


public class UpdateUserService {

	public UserDTO updateUser() {
		DaoImpl daoImpl=new DaoImpl();
		UserDTO dtos=daoImpl.updateUser();
		return dtos;
		
	}
	
}

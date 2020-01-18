package com.dev.proj.ARSService;


import com.dev.proj.ARSDTO.*;
import com.dev.proj.ARSController.*;
import com.dev.proj.ARSDAOImpl.DaoImpl;
public class SearchUserService {

	public UserDTO searchUser() {
		
		DaoImpl daoImpl=new DaoImpl();
		UserDTO dtos=daoImpl.searchUser();
		return dtos;
		
	}
}

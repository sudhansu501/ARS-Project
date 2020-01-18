package com.dev.proj.ARSService;

import java.util.List;

import com.dev.proj.ARSDAOImpl.*;
import com.dev.proj.ARSDTO.*;
import com.dev.proj.ARSService.SearchUserService;

public class DeleteUserService {

	public boolean deleteUser() {
		DaoImpl daoImpl=new DaoImpl();
		boolean res=daoImpl.deleteUser();
		return res;
	} 
	
}

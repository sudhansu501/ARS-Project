package com.dev.proj.ARSService;

import com.dev.proj.ARSDAOImpl.DaoImpl;
import com.dev.proj.ARSDTO.AirportDTO;

public class SearchAirportService 
{
public AirportDTO searchAirport() {
	
	DaoImpl daoImpl=new DaoImpl();
	AirportDTO dto=daoImpl.searchAirport();
	return dto;
}
}

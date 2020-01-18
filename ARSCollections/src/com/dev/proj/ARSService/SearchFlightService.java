package com.dev.proj.ARSService;


import com.dev.proj.ARSDAOImpl.DaoImpl;

import com.dev.proj.ARSDTO.AirportDTO;
import com.dev.proj.ARSDTO.FlightDTO;
public class SearchFlightService
{
	public FlightDTO searchFlight() {
		DaoImpl daoImpl=new DaoImpl();
		FlightDTO detailsDTO=daoImpl.searchFlight();
		return detailsDTO;
	}
}
	
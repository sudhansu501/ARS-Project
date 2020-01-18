package com.dev.proj.ARSController;

import com.dev.proj.ARSDTO.FlightDTO;
import com.dev.proj.ARSService.SearchAirportService;
import com.dev.proj.ARSService.SearchFlightService;

public class SearchRoomController {
public static void main(String[] args) {
	SearchFlightService roomService=new SearchFlightService();
	FlightDTO detailsDTO=roomService.searchFlight();
	if(detailsDTO!=null)
	{
		System.out.println(detailsDTO);
	}else
	{
		System.out.println("Room Not Found");
	}
}
}

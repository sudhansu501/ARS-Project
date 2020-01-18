package com.dev.proj.ARSController;

import com.dev.proj.ARSDTO.AirportDTO;
import com.dev.proj.ARSService.SearchAirportService;

public class SearchAirportController
{
public static void main(String[] args) {
	SearchAirportService hotelService=new SearchAirportService();
	AirportDTO dto=hotelService.searchAirport();
	
	if(dto!=null)
	{
		System.out.println(dto);
	}
	
	else
	{
		System.out.println("Hotel Not Found");
	}
	
}
}

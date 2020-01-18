package com.dev.proj.ARSDAOImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.dev.proj.ARSDTO.*;


public class DaoImpl  {

	public static List<UserDTO> createUser()
	{
		List<UserDTO> list=new ArrayList<UserDTO>();
		
		UserDTO user1=new UserDTO(1,"abc","****","user",78945612,"abc@gmail.com");
		UserDTO user2=new UserDTO(2,"def","*****","airportExecutive",546351,"def@gmail.com");
		UserDTO user3=new UserDTO(3,"ghi","*****","admin",2345678,"ghi@gmail.com");
		UserDTO user4=new UserDTO(4,"jkl","*****","user",78945612,"jkl@gmail.com");
		UserDTO user5=new UserDTO(5,"mno","*****","user",78945612,"mno@gmail.com");
		UserDTO user6=new UserDTO(6,"pqr","*****","admin",234567,"pqr@gmail.com");
		
		list.add(user1);
		list.add(user2);
		list.add(user3);
		list.add(user4);
		list.add(user5);
		list.add(user6);
		
		
		
		return list;
		
	}
	
	public  UserDTO updateUser()
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the user id");
		int id=scanner.nextInt();
		List<UserDTO> list=createUser();
		UserDTO dto=null;
		for (UserDTO userDTO : list) {
			if(userDTO.getUserId()==id)
			{
				System.out.println("Enter the user name");	
				String name=scanner.next();
				System.out.println("Enter the Role");	
				String role=scanner.next();
				
			userDTO.setUsername(name);
			userDTO.setRole(role);
			
			list.add(userDTO);
			return userDTO;
			}
		}
		
		return dto;
		}
	
	public  UserDTO searchUser()
	{
		Scanner  scanner=new Scanner(System.in);
		
		System.out.println("Enter the user id");
		int id=scanner.nextInt();
		UserDTO dto=null;
		List<UserDTO> list=createUser();
		for (UserDTO userDTO : list) {
			
			if(userDTO.getUserId()==id)
			{
				return userDTO;
				
			}
		
		}
		
		return dto;
		
	}
	
	public  boolean deleteUser()
	{
		Scanner  scanner=new Scanner(System.in);
		
		System.out.println("Enter the user id to delete");
		int id=scanner.nextInt();
		
		List<UserDTO> list=createUser();
		for (UserDTO userDTO : list) {
			
			if(userDTO.getUserId()==id)
			{
				list.remove(list);
				return true;
			}
		
		}
		
		return false;
		
	}
	
	
	public static List<AirportDTO> addairport()
	{
		List<AirportDTO> list = new ArrayList<AirportDTO>();
		AirportDTO Airport1 = new AirportDTO("1", "abc" , "Banglore" ,  98334455, "abc@gmail.com");
		AirportDTO Airport2= new AirportDTO("2", "xyz" , "hyderabad" , 2345678 ,"xyz@gmail.com" );
		AirportDTO Airport3 = new AirportDTO("3", "pqr" , "chennai" , 98334455,"pqr@gmail.com" );
		AirportDTO Airport4= new AirportDTO("4", "asd" , "pune" , 2345678,"asd@gmail.com");
		
		
		list.add(Airport1);
		list.add(Airport2);
		list.add(Airport3);
		list.add(Airport4);
		
		return list;
		
	}

	 	public  AirportDTO searchAirport()
	{
		Scanner  scanner=new Scanner(System.in);
		
		System.out.println("Enter the airport id");
		String airportid=scanner.next();
		
		AirportDTO dto=null;
		List<AirportDTO> list=addairport();
		for (AirportDTO airportDTO : list) {

			if(airportDTO.getAirportId().equals(airportid))
			{
				return airportDTO;
			}
		
		}
		
		return dto;
		
	}
	
	 
	
	
	
	
	
	
	public static List<FlightDTO> addFlight()
	{
		FlightDTO flight1=new FlightDTO("1","xyz","10/11/18","10/12/19","bnglr","hyd","12:00","1:00",5000.99);
		FlightDTO flight2=new FlightDTO("2","abc","04/12/18","6/12/18","chennai","kolkata","12:00","1:00",5000.99);
		FlightDTO flight3=new FlightDTO("3","pqr","11/11/18","7/12/19","tpt","hyd","7:00","1:00",5000.99);
		FlightDTO flight4=new FlightDTO("4","sss","12/11/18","19/12/19","tpt","bnglr","6:00","1:00",5000.99);
		
		
		
		
		
		
		
		
		List<FlightDTO> list = new ArrayList<FlightDTO>();
		list.add(flight1);
		list.add(flight2);
		list.add(flight3);
		list.add(flight4);
		
		
		
		return list;
	}
	
//	 
	private Object FlightDTORoom() {
		// TODO Auto-generated method stub
		return null;
	}

	public FlightDTO searchFlight()
	{
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the flight id");
		String id=scanner.next();

		FlightDTO detailsDTO=null;
		
		List<FlightDTO> list=addFlight();
 
	       for (FlightDTO flightDTO  : list) {
			
	    	   if(FlightDTO.getFlightNo().equals(id))
	    	   {
	    	   return flightDTO;
	    	   
		     }
		 
		
	       }
		
		return detailsDTO;
	}
	public boolean deleteFlight()
	{
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the flight id");
		String id=scanner.next();

		List<FlightDTO> list=addFlight();
 
	       for (FlightDTO flightDTO  : list) {
			
	    	   if(FlightDTO.getFlightNo().equals(id))
	    	   {
	    	  list.remove(id);
	    	   return true;
	    	   
		}
		 
		
	       }
		
		return false;
	}
	
	
	public List<BookingDetailsDTO> booking()
	{
		List<BookingDetailsDTO> booking=new ArrayList<BookingDetailsDTO>();
		
		BookingDetailsDTO booking1=new BookingDetailsDTO(1, 101, 1,"ap", "bnglr", 2, 1,5200.00,11);
		BookingDetailsDTO booking2=new BookingDetailsDTO(2, 102, 2,"tpt", "hyd", 3, 4,4500.00,12);
		
		BookingDetailsDTO booking3=new BookingDetailsDTO(1, 101, 1,"kerala", "hyd", 2, 3,6200.00,13);
		BookingDetailsDTO booking4=new BookingDetailsDTO(1, 101, 1,"mumbai", "bnglr", 2, 2,7400.00,14);
		
		
		booking.add(booking1);
		booking.add(booking2);
		booking.add(booking3);
		booking.add(booking4);
		return booking;
	}
	

}

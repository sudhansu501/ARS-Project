package com.dev.proj.ARSDTO;

import java.sql.Date;
import java.sql.Time;

public class FlightDTO {

	private static  String flightNo;
	private String airline ;
	private String depDate ;
	private String arrDate ;
	private String depCity ;
	private String arrCity ;

	
	private String depTime ;
	private String arrTime ;

	private double fare;


	public FlightDTO(String flightno,String airline, String depDate, String arrDate, String depCity, String arrCity, String depTime,
			String arrTime, double fare) {
		super();
		this.flightNo =flightno;
		this.airline = airline;
		this.depDate = depDate;
		this.arrDate = arrDate;
		this.depCity = depCity;
		this.arrCity = arrCity;
		this.depTime = depTime;
		this.arrTime = arrTime;
		this.fare = fare;
	}

	

	@Override
	public String toString() {
		return "FlightDTO [flightNo=" + flightNo + ", airline=" + airline + ", depDate=" + depDate + ", arrDate="
				+ arrDate + ", depCity=" + depCity + ", arrCity=" + arrCity + ", depTime=" + depTime + ", arrTime="
				+ arrTime + ", fare=" + fare + "]";
	}

	public static  String getFlightNo() {
		return flightNo;
	}

	public void setFlightNo(String flightNo) {
		this.flightNo = flightNo;
	}

	public String getAirline() {
		return airline;
	}

	public void setAirline(String airline) {
		this.airline = airline;
	}

	public String getDepDate() {
		return depDate;
	}

	public void setDepDate(String depDate) {
		this.depDate = depDate;
	}

	public String getArrDate() {
		return arrDate;
	}

	public void setArrDate(String arrDate) {
		this.arrDate = arrDate;
	}

	public String getDepCity() {
		return depCity;
	}

	public void setDepCity(String depCity) {
		this.depCity = depCity;
	}

	public String getArrCity() {
		return arrCity;
	}

	public void setArrCity(String arrCity) {
		this.arrCity = arrCity;
	}

	public String getDepTime() {
		return depTime;
	}

	public void setDepTime(String depTime) {
		this.depTime = depTime;
	}

	public String getArrTime() {
		return arrTime;
	}

	public void setArrTime(String arrTime) {
		this.arrTime = arrTime;
	}

	public double getFare() {
		return fare;
	}

	public void setFare(double fare) {
		this.fare = fare;
	}

	
	
}

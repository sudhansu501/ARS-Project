package com.dev.proj.ARSDTO;

public class AirportDTO {

	private String airportId;
    private String airportName;
	
	private String location;
	private int phoneNo;
	private String email;
	public AirportDTO(String airportId, String airportName, String location, int phoneNo, String email) {
		super();
		this.airportId = airportId;
		this.airportName = airportName;
		this.location = location;
		this.phoneNo = phoneNo;
		this.email = email;
	}
	public String getAirportId() {
		return airportId;
	}
	public void setAirportId(String airportId) {
		this.airportId = airportId;
	}
	public String getAirportName() {
		return airportName;
	}
	public void setAirportName(String airportName) {
		this.airportName = airportName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "AirportDTO [airportId=" + airportId + ", airportName=" + airportName + ", location=" + location
				+ ", phoneNo=" + phoneNo + ", email=" + email + "]";
	}
	
	
}
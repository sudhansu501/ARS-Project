package com.dev.proj.ARSDTO;

import java.sql.Date;

public class BookingDetailsDTO {

	private int bookingId;
	private int flightno;
	private int  userId;
	private String srcCity;
	private String destCity;
	private int noOfAdults;
	private int noOfChildren;
	private double amount;
	private int seatNo;
	
	public BookingDetailsDTO(int bookingId, int flightno, int userId, String srcCity, String destCity, int noOfAdults,
			int noOfChildren, double amount, int seatNo) {
		super();
		this.bookingId = bookingId;
		this.flightno = flightno;
		this.userId = userId;
		this.srcCity = srcCity;
		this.destCity = destCity;
		this.noOfAdults = noOfAdults;
		this.noOfChildren = noOfChildren;
		this.amount = amount;
		this.seatNo = seatNo;
	}
	public int getBookingId() {
		return bookingId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	public int getFlightno() {
		return flightno;
	}
	public void setFlightno(int flightno) {
		this.flightno = flightno;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getSrcCity() {
		return srcCity;
	}
	public void setSrcCity(String srcCity) {
		this.srcCity = srcCity;
	}
	public String getDestCity() {
		return destCity;
	}
	public void setDestCity(String destCity) {
		this.destCity = destCity;
	}
	public int getNoOfAdults() {
		return noOfAdults;
	}
	public void setNoOfAdults(int noOfAdults) {
		this.noOfAdults = noOfAdults;
	}
	public int getNoOfChildren() {
		return noOfChildren;
	}
	public void setNoOfChildren(int noOfChildren) {
		this.noOfChildren = noOfChildren;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public int getSeatNo() {
		return seatNo;
	}
	public void setSeatNo(int seatNo) {
		this.seatNo = seatNo;
	}
	@Override
	public String toString() {
		return "BookingDetailsDTO [bookingId=" + bookingId + ", flightno=" + flightno + ", userId=" + userId
				+ ", srcCity=" + srcCity + ", destCity=" + destCity + ", noOfAdults=" + noOfAdults + ", noOfChildren="
				+ noOfChildren + ", amount=" + amount + ", seatNo=" + seatNo + "]";
	}
	
}
	
	
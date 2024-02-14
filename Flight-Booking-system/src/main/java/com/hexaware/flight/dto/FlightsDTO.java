package com.hexaware.flight.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.cglib.core.Local;

public class FlightsDTO {
	private int flightNumber;
	private String airline;
	private String departureAirport;
	private String arrivalArport;
	private LocalDate dateTime;
	private String filghtDesc;
	private double ticketPrice;
	public int getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}
	public String getAirline() {
		return airline;
	}
	public void setAirline(String airline) {
		this.airline = airline;
	}
	public String getDepartureAirport() {
		return departureAirport;
	}
	public void setDepartureAirport(String departureAirport) {
		this.departureAirport = departureAirport;
	}
	public String getArrivalArport() {
		return arrivalArport;
	}
	public void setArrivalArport(String arrivalArport) {
		this.arrivalArport = arrivalArport;
	}
	public LocalDate getDateTime() {
		return dateTime;
	}
	public void setDateTime(LocalDate dateTime) {
		this.dateTime = dateTime;
	}
	public String getFilghtDesc() {
		return filghtDesc;
	}
	public void setFilghtDesc(String filghtDesc) {
		this.filghtDesc = filghtDesc;
	}
	public double getTicketPrice() {
		return ticketPrice;
	}
	public void setTicketPrice(double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}
	
	

}

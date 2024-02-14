package com.hexaware.flight.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Flights {
	
	@Id
	@SequenceGenerator(name="flightSeq",initialValue = 10,allocationSize = 5)
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "flightSeq")
	private int flightNumber;
	
	@NotBlank
	private String airline;
	
	@NotBlank
	private String departureAirport;
	@NotBlank
	private String arrivalArport;
	private LocalDate dateTime;
	@NotBlank
	private String filghtDesc;
	
	@DecimalMin(value="3000.00")
	@DecimalMax(value="10000.00")
	private double ticketPrice;

	public Flights() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Flights(int flightNumber, @NotBlank String airline, @NotBlank String departureAirport,
			@NotBlank String arrivalArport, LocalDate dateTime, @NotBlank String filghtDesc,
			@DecimalMin("3000.00") @DecimalMax("10000.00") double ticketPrice) {
		super();
		this.flightNumber = flightNumber;
		this.airline = airline;
		this.departureAirport = departureAirport;
		this.arrivalArport = arrivalArport;
		this.dateTime = dateTime;
		this.filghtDesc = filghtDesc;
		this.ticketPrice = ticketPrice;
	}

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

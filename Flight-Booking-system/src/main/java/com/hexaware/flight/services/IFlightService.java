package com.hexaware.flight.services;

import java.util.List;

import com.hexaware.flight.dto.FlightsDTO;
import com.hexaware.flight.entity.Flights;

public interface IFlightService {
	
	public Flights addNewFlights(FlightsDTO flightsDTO);
	public Flights updateExistingFlights(FlightsDTO flightsDTO,int flightNumber);
	public void deleteFlights(int flightNumber);
	public FlightsDTO getFlightByFlightNumber(int flightNumber);
	public List<Flights> getAllFlights();

}

package com.hexaware.flight.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.flight.dto.FlightsDTO;
import com.hexaware.flight.entity.Flights;
import com.hexaware.flight.repository.FlightsRepository;
@Service
public class FlightsService implements IFlightService {

	
	@Autowired
	private FlightsRepository repository;
	@Override
	public Flights addNewFlights(FlightsDTO flightsDTO) {
		Flights flights=new Flights();
		flights.setAirline(flightsDTO.getAirline());
		flights.setDepartureAirport(flightsDTO.getDepartureAirport());
		flights.setArrivalArport(flightsDTO.getArrivalArport());
		flights.setDateTime(flightsDTO.getDateTime());
		flights.setFilghtDesc(flightsDTO.getFilghtDesc());
		flights.setTicketPrice(flightsDTO.getTicketPrice());
		return repository.save(flights);
	}

	@Override
	public Flights updateExistingFlights(FlightsDTO flightsDTO, int flightNumber) {
		Flights existingFlights=repository.findById(flightNumber).orElse(new Flights());
		existingFlights.setAirline(flightsDTO.getAirline());
		existingFlights.setDepartureAirport(flightsDTO.getDepartureAirport());
		existingFlights.setArrivalArport(flightsDTO.getArrivalArport());
		existingFlights.setDateTime(flightsDTO.getDateTime());
		existingFlights.setFilghtDesc(flightsDTO.getFilghtDesc());
		existingFlights.setTicketPrice(flightsDTO.getTicketPrice());
		return repository.save(existingFlights);
	}

	@Override
	public void deleteFlights(int flightNumber) {
		repository.deleteById(flightNumber);

	}

	@Override
	public FlightsDTO getFlightByFlightNumber(int flightNumber) {
		Flights flights=repository.findById(flightNumber).orElse(new Flights());
		FlightsDTO flightDTO=new FlightsDTO();
		flightDTO.setFlightNumber(flights.getFlightNumber());
		flightDTO.setAirline(flights.getAirline());
		flightDTO.setDepartureAirport(flights.getDepartureAirport());
		flightDTO.setArrivalArport(flights.getArrivalArport());
		flightDTO.setDateTime(flights.getDateTime());
		flightDTO.setFilghtDesc(flights.getFilghtDesc());
		flightDTO.setTicketPrice(flights.getTicketPrice());
		return flightDTO;
	}

	@Override
	public List<Flights> getAllFlights() {
	
		return repository.findAll();
	}

}

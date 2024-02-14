package com.hexaware.flight.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.hexaware.flight.dto.FlightsDTO;
import com.hexaware.flight.entity.Flights;
import com.hexaware.flight.services.IFlightService;

@CrossOrigin(origins="http://localhost:64995")
@RestController
@RequestMapping("/api/v1/flights")
public class FlightsRestController {
	@Autowired
	private IFlightService flightService;
	
	@PostMapping("/add/newflights")
	public Flights addNewFlights(@RequestBody FlightsDTO flightDTO)
	{
		return flightService.addNewFlights(flightDTO);
	}

	@PutMapping("/update/flights/{flightNumber}")
	public Flights updateFlights(@RequestBody FlightsDTO flightsDTO,@PathVariable int flightNumber)
	
	{
		return flightService.updateExistingFlights(flightsDTO, flightNumber);
	}
	
	@DeleteMapping("/delete/flights/{flightNumber}")
	public void deleteFlights(@PathVariable int flightNumber)
	{
		flightService.deleteFlights(flightNumber);
	}
	
	@GetMapping("/get/flight/{flightNumber}")
	public FlightsDTO getFlightsByNumber(@PathVariable int flightNumber)
	{
		return flightService.getFlightByFlightNumber(flightNumber);
	}
	
	@GetMapping("/getall/flights")
	public List<Flights> getAllFlights()
	{
		return flightService.getAllFlights();
	}
}

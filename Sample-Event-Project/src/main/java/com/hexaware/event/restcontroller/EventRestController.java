package com.hexaware.event.restcontroller;

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

import com.hexaware.event.dto.EventDTO;
import com.hexaware.event.entity.Events;
import com.hexaware.event.service.IEventService;

@CrossOrigin(origins = "http://localhost:64266")
@RestController
@RequestMapping("/api/v1/events")
public class EventRestController {

	@Autowired
	private IEventService eventService;
	
	@PostMapping("/create/newevents")
	public Events createNewEvent(@RequestBody EventDTO eventDto)
	{
		return eventService.createNewEvent(eventDto);
	}
	
	@GetMapping("/getall/events")
	public List<Events> getAllEvents()
	{
		return eventService.getAlltheEvents();
	}
	
	@PutMapping("/update/event/{eventId}")
	public Events updateExistingEvents(@RequestBody EventDTO eventDTO,@PathVariable long eventId)
	{
		return eventService.updateExistingEvent(eventDTO, eventId);
	}
	
	@GetMapping("/geteventbyid/{eventId}")
	public EventDTO getById(@PathVariable long eventId)
	{
		return eventService.getEventById(eventId);
	}
	
	@DeleteMapping("/deleteevent/{eventId}")
	public void deleteEventMapping(@PathVariable long eventId)
	{
		 eventService.deleteEventByEventId(eventId);
	}
}

package com.hexaware.event.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.event.dto.EventDTO;
import com.hexaware.event.entity.Events;
import com.hexaware.event.repository.EventRepository;

@Service
public class EventService implements IEventService {

	
	Logger logger=LoggerFactory.getLogger(EventService.class);
	@Autowired
	private EventRepository repository;
	
	@Override
	public Events createNewEvent(EventDTO eventDto) {
		Events events=new Events();
		events.setEventTitle(eventDto.getEventTitle());
		events.setDescription(eventDto.getDescription());
		events.setEventDate(eventDto.getEventDate());
		events.setEventLocation(eventDto.getEventLocation());
		events.setMaxAttendees(eventDto.getMaxAttendees());
		events.setRegistrationFees(eventDto.getRegistrationFees());
		logger.info("Events Added Successfully");
		return repository.save(events);
	}

	@Override
	public Events updateExistingEvent(EventDTO eventDto, long eventId) {
		Events events=repository.findById(eventId).orElse(new Events());
		events.setEventTitle(eventDto.getEventTitle());
		events.setDescription(eventDto.getDescription());
		events.setEventDate(eventDto.getEventDate());
		events.setEventLocation(eventDto.getEventLocation());
		events.setMaxAttendees(eventDto.getMaxAttendees());
		events.setRegistrationFees(eventDto.getRegistrationFees());
		
		return repository.save(events);
	}

	@Override
	public void deleteEventByEventId(long eventId) {
		Events event=repository.findById(eventId).orElse(new Events());
		if(event!=null)
		{
			repository.deleteById(eventId);
		}
		else
		{
			System.out.println("Id is not available");
		};
		
	}

	@Override
	public EventDTO getEventById(long eventId) {
		Events events=repository.findById(eventId).orElse(new Events());
		EventDTO eventDto=new EventDTO();
		eventDto.setEventId(events.getEventId());
		eventDto.setEventTitle(events.getEventTitle());
		eventDto.setDescription(events.getDescription());
		eventDto.setEventDate(events.getEventDate());
		eventDto.setEventLocation(events.getEventLocation());
		eventDto.setMaxAttendees(events.getMaxAttendees());
		eventDto.setRegistrationFees(events.getRegistrationFees());
		return eventDto;
	}

	@Override
	public List<Events> getAlltheEvents() {
		
		return repository.findAll();
	}

}

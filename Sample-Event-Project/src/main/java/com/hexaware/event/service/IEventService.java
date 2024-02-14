package com.hexaware.event.service;

import java.util.List;

import com.hexaware.event.dto.EventDTO;
import com.hexaware.event.entity.Events;

public interface IEventService {

	public Events createNewEvent(EventDTO eventDto);
	public Events updateExistingEvent(EventDTO eventDto,long eventId);
	public void deleteEventByEventId(long eventId);
	public EventDTO getEventById(long eventId);
	public List<Events> getAlltheEvents();
}

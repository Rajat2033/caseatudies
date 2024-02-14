package com.hexaware.event.dto;

import java.time.LocalDate;

public class EventDTO {
	private long eventId;
	private String eventTitle;
	private String description;
	private LocalDate eventDate;
	private String eventLocation;
	private int maxAttendees;
	private double registrationFees;
	public long getEventId() {
		return eventId;
	}
	public void setEventId(long eventId) {
		this.eventId = eventId;
	}
	public String getEventTitle() {
		return eventTitle;
	}
	public void setEventTitle(String eventTitle) {
		this.eventTitle = eventTitle;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public LocalDate getEventDate() {
		return eventDate;
	}
	public void setEventDate(LocalDate eventDate) {
		this.eventDate = eventDate;
	}
	public String getEventLocation() {
		return eventLocation;
	}
	public void setEventLocation(String eventLocation) {
		this.eventLocation = eventLocation;
	}
	public int getMaxAttendees() {
		return maxAttendees;
	}
	public void setMaxAttendees(int maxAttendees) {
		this.maxAttendees = maxAttendees;
	}
	public double getRegistrationFees() {
		return registrationFees;
	}
	public void setRegistrationFees(double registrationFees) {
		this.registrationFees = registrationFees;
	}
	
}

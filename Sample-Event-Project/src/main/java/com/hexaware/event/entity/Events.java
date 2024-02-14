package com.hexaware.event.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Events {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long eventId;
	private String eventTitle;
	private String description;
	private LocalDate eventDate;
	private String eventLocation;
	private int maxAttendees;
	private double registrationFees;
	public Events() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Events(long eventId, String eventTitle, String description, LocalDate eventDate, String eventLocation,
			int maxAttendees, double registrationFees) {
		super();
		this.eventId = eventId;
		this.eventTitle = eventTitle;
		this.description = description;
		this.eventDate = eventDate;
		this.eventLocation = eventLocation;
		this.maxAttendees = maxAttendees;
		this.registrationFees = registrationFees;
	}
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
	@Override
	public String toString() {
		return "Events [eventId=" + eventId + ", eventTitle=" + eventTitle + ", description=" + description
				+ ", eventDate=" + eventDate + ", eventLocation=" + eventLocation + ", maxAttendees=" + maxAttendees
				+ ", registrationFees=" + registrationFees + "]";
	}
	
	
	

}

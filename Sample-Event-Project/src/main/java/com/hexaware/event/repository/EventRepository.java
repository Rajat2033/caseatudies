package com.hexaware.event.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hexaware.event.entity.Events;

@Repository
public interface EventRepository extends JpaRepository<Events, Long> {

}

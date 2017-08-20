package com.kgfsl.event.repository;

import com.kgfsl.event.bean.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("eventRepository")
public interface EventAgendaRepository extends JpaRepository<Event, Long> {

}

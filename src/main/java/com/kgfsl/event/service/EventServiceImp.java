package com.kgfsl.event.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kgfsl.event.bean.Event;
import com.kgfsl.event.repository.EventAgendaRepository;

@Service("eventService")
public class EventServiceImp implements EventService {

	@Autowired
	private EventAgendaRepository eventRepository;

	@Override
	public List<Event> getAll() {
		// TODO Auto-generated method stub
		return eventRepository.findAll();
	}

}

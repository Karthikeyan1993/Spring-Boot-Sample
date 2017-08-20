package com.kgfsl.event.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.kgfsl.event.bean.Event;
import com.kgfsl.event.service.EventService;

@RestController
public class EventController {

	@Autowired
	private EventService eventService;

	@RequestMapping(value = "/events", method = RequestMethod.GET)
	public List<Event> getAllEvents() {
		return eventService.getAll();
	}

}

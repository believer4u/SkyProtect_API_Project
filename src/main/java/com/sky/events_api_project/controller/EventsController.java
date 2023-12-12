package com.sky.events_api_project.controller;

import com.sky.events_api_project.entity.Event;
import com.sky.events_api_project.service.EventsService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
public class EventsController {
    private final EventsService eventsService;

    @PostMapping("/post")
    public ResponseEntity<Event> addEvent(@RequestBody Event event){
        return eventsService.addEvent(event);
    }
}
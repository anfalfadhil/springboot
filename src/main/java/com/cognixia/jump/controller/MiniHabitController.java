package com.cognixia.jump.controller;


import java.util.List;
import java.util.Optional;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cognixia.jump.repository.MiniHabitRepository;
import com.cognixia.jump.model.MiniHabit;


@RestController
@RequestMapping("/api")
public class MiniHabitController {
	
	@Autowired
	MiniHabitRepository repo;
	
	@GetMapping("/minihabit")
	public List<MiniHabit> getMiniHabits() {
		return repo.findAll();
	}

}

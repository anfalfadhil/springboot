package com.cognixia.jump.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognixia.jump.model.MiniHabit;
import com.cognixia.jump.repository.MiniHabitRepository;




@Service
public class MiniHabitService {
	
	@Autowired
	MiniHabitRepository repo;

	public List<MiniHabit> getMiniHabits(){
		return repo.findAll();
				
	}
	
	public Optional<MiniHabit> getMiniHabitById(int id) {
		return repo.findById(id);
	}
}

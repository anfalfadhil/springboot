package com.cognixia.jump.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognixia.jump.model.MiniHabit;


@Repository
public interface MiniHabitRepository extends JpaRepository<MiniHabit, Integer> {

}

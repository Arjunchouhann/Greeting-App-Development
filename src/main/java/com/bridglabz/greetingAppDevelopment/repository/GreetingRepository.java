package com.bridglabz.greetingAppDevelopment.repository;

import com.bridglabz.greetingAppDevelopment.entity.GreetingEntity;
import org.springframework.data.jpa.repository.JpaRepository;
//To add all the greetings
public interface GreetingRepository extends JpaRepository<GreetingEntity, Long> {
}


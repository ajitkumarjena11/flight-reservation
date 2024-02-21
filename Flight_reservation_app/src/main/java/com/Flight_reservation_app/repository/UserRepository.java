 package com.Flight_reservation_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Flight_reservation_app.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String email);
	
}

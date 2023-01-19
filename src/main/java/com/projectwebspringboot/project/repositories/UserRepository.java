package com.projectwebspringboot.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectwebspringboot.project.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	
}

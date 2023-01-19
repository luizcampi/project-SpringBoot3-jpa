package com.projectwebspringboot.project.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projectwebspringboot.project.entities.Order;
import com.projectwebspringboot.project.entities.User;
import com.projectwebspringboot.project.repositories.OrderRepository;
import com.projectwebspringboot.project.repositories.UserRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository repository;
	
	public List<Order> findAll(){
		return repository.findAll();
	}
	
	public Order findById(Long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();
	}
}

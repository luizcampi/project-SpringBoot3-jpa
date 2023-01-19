package com.projectwebspringboot.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectwebspringboot.project.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long> {
}

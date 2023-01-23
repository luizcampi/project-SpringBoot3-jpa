package com.projectwebspringboot.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectwebspringboot.project.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}

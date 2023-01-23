package com.projectwebspringboot.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectwebspringboot.project.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}

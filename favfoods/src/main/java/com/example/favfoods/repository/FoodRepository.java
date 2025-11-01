package com.example.favfoods.repository;

import com.example.favfoods.model.food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository extends JpaRepository<food, Long> {
}

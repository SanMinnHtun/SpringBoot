package com.example.favfoods.controller;

import com.example.favfoods.model.food;
import com.example.favfoods.repository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/foods")
public class FoodController {

    @Autowired
    private FoodRepository foodRepository;

    @GetMapping
    public List<food> getAllFoods() {
        return foodRepository.findAll();
    }

    @GetMapping("/{id}")
    public food getFoodById(@PathVariable Long id) {
        return foodRepository.findById(id).orElse(null);
    }

    @PostMapping
    public food createFood(@RequestBody food food) {
        return foodRepository.save(food);
    }

    @PutMapping("/{id}")
    public food updateFood(@PathVariable Long id, @RequestBody food foodDetails) {
        Optional<food> optionalFood = foodRepository.findById(id);
        if (!optionalFood.isPresent()) return null;

        food food = optionalFood.get();
        food.setName(foodDetails.getName());
        food.setCuisine(foodDetails.getCuisine());
        food.setVegetarian(foodDetails.isVegetarian());

        return foodRepository.save(food);
    }

    @DeleteMapping("/{id}")
    public String deleteFood(@PathVariable Long id) {
        foodRepository.deleteById(id);
        return "Food deleted with id " + id;
    }
    @GetMapping("/")
    public String home() {
        return "WELCOME Nigga! Visit /foods";
    }

}

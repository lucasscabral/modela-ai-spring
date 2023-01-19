package com.modela_ai.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.modela_ai.api.dto.carsDTO;
import com.modela_ai.api.model.cars;
import com.modela_ai.api.repository.carsRepository;

@RestController
@RequestMapping("/cars")
public class carsController {

  @Autowired
  private carsRepository repository;

  @GetMapping
  public List<cars> getCars() {
    return repository.findAll();
  }

  @PostMapping
  public void createCars(@RequestBody carsDTO req) {

    repository.save(new cars(req));
  }

}

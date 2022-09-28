package com.enterprisegrade.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.enterprisegrade.backend.model.City;
import com.enterprisegrade.backend.repository.CityRepository;

@RestController
@RequestMapping("/api")
public class CityController {
	
	@Autowired
	private CityRepository cityRepository;
	
	public List<City> getCities() {
		return cityRepository.findAll();	
	}

}

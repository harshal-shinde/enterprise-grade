package com.enterprisegrade.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.enterprisegrade.backend.model.City;

@Repository
public interface CityRepository extends JpaRepository<City, Long> {

}

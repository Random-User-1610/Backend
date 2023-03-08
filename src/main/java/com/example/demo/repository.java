package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface repository extends JpaRepository<Model,Integer>{
	
	@Query("select u from Model u where u.is_available=:a")
	public  List<Model> getAllAvailableCars(@Param("a") String is_available);
	
	
	@Query("select u from Model u where u.car_name=:a and u.is_available=:b")
	public  List<Model> getAllAvailableCarsByName(@Param("a") String name,@Param("b") String is_available);
}
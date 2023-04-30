package com.example.DMS.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.DMS.models.Dog;

public interface DogRepository extends CrudRepository<Dog , Integer>{
	List<Dog> findByName(String name);

}


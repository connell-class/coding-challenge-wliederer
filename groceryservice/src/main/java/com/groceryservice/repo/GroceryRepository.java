package com.groceryservice.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.groceryservice.model.Item;

@Repository
public interface GroceryRepository extends CrudRepository<Item,Integer> {
	
	

}

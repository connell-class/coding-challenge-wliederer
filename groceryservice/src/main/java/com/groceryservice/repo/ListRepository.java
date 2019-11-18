package com.groceryservice.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.groceryservice.model.GroceryList;

@Repository
public interface ListRepository extends CrudRepository<GroceryList, Integer> {

}

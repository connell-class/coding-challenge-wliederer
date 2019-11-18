package com.groceryservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.groceryservice.model.GroceryList;
import com.groceryservice.repo.ListRepository;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/grocery")
public class ListController {
	
	@Autowired
	private ListRepository lr;
	
	
	@PostMapping("/saveList")
	public boolean save(@RequestBody GroceryList list) {
		try {
			lr.save(list);
			return true;
		}catch (Exception e){
			return false;
		}
	}
	
	@GetMapping("/listAll")
	public Iterable<GroceryList> getAll(){
		return lr.findAll();
	}

}

package com.groceryservice.controller;

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.groceryservice.model.Item;
import com.groceryservice.repo.GroceryRepository;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/item")
public class ItemController {
	
	
	@Autowired
	private GroceryRepository gr;
	
	
	@PostMapping("/saveItem")
	public void save(@RequestBody Item item) {
			gr.save(item);	
	}
	
	
	

}

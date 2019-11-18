package com.groceryservice.controller;

import java.util.ArrayList; 
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.groceryservice.model.GroceryList;
import com.groceryservice.model.Item;
import com.groceryservice.repo.ListRepository;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/grocery")
public class ListController {
	
	List<Item> list;
	public ListController() {
		list = new ArrayList<>();
		list.add(new Item(1,"food","apple"));
	}
	
	@Autowired
	private ListRepository lr;
	
	
	
	public ListRepository getLr() {
		return lr;
	}


	@Autowired
	public void setLr(ListRepository lr) {
		this.lr = lr;
	}



	@GetMapping(value="/test")
	public List<Item> getTest() {
		return list;
	}
	
	
	
	@PostMapping("/saveList")
	public void save(@RequestBody GroceryList list) {
			lr.save(list);	
	}
	
	@PostMapping("/deleteList")
	public void delete(@RequestBody GroceryList list) {
			lr.delete(list);	
	}
	
	@PostMapping("/deleteItem")
	public void deleteItem(@RequestBody GroceryList list) {
			lr.delete(list);	
	}
	
	@GetMapping("/listAll")
	public Iterable<GroceryList> getAll(){
		return lr.findAll();
	}
	
	@PostMapping("/grocerylists/items/{itemId}") 
	public void deleteListItem(@RequestBody GroceryList list) {
			lr.delete(list);	
	}

}

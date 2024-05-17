package com.tech.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tech.Dto.Product;
import com.tech.Service.ProService;

@RestController
public class ProController {

	
	public ProController() {
		System.out.println("inside  Procontroller constructor");
	}

	@Autowired
	ProService proService;
	
	@GetMapping("/get")
	public String add() {
		return "hi helllllo  ProService";
		
	}
	
	@PostMapping("/creatall")
	public List<Product> creat(@RequestBody List<Product> pro) {
		return proService.Create(pro);

	}
	
	@GetMapping("/getall")
	public List<Product> getall() {
		return proService.getall();
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete( @PathVariable("id") int id) {
		proService.delete(id);
	}
	
	@GetMapping("/findbyid/{id}")
	public Product findById(@PathVariable int id) {
		return proService.findById(id);
		
	}
	
	@GetMapping("/findbyname/{name}")
	public List<Product> findbyname(@PathVariable("name") String name) {
		return proService.findByname(name);
		
	}
	 
	@PostMapping("/createone")
	public Product createone(@RequestBody Product pro) {
		return proService.createone(pro);
		
	}
}

package com.tech.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tech.Dto.Product;
import com.tech.Repository.Prorepository;

@Service
public class ProService {
	
	@Autowired
	Prorepository prorepository;
	
	public ProService() {
		System.out.println("inside service constructor");
	}
	
    public List<Product> Create( List<Product> product) {
		
		return prorepository.saveAll(product) ;
		
	}
 
	public List<Product> getall(){
	return	prorepository.findAll();
		
	}
	
	public void delete(int s) {
		prorepository.deleteById(s);
		
	}

	
	public Product findById(int id) {
		return prorepository.findById(id).get();
		
	}
	
	public List<Product> findByname(String name) {
		return prorepository.findByName(name);
	}

	public Product createone(Product student) {
		
		return prorepository.save(student);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

//	@Autowired
//	ProductRepository productRepository;
//	
//	public List<Product> getAllActiveProduct() {
//		System.out.println("inside ProductServiceImpl getAll");
//		List<Product> p1=productRepository.findAll();
//		System.out.println("list of product"+p1);
//		return p1;
//	}

}

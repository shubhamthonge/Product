package com.tech.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tech.Dto.Product;

@Repository
public interface  Prorepository extends JpaRepository<Product, Integer> {

	List<Product> findByName(String name);

}

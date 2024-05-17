package com.tech.Dto;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table (name="ProductTable")
public class Product {

	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	
	@Column
	private String name;
	
	@Column
	private String Brand;
	
	@Column
	private String ExpDate;
	
	@Column
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "id")
	
	List<ProductDetails> productD;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return Brand;
	}

	public void setBrand(String brand) {
		Brand = brand;
	}

	public String getExpDate() {
		return ExpDate;
	}

	public void setExpDate(String expDate) {
		ExpDate = expDate;
	}

	public List<ProductDetails> getProductD() {
		return productD;
	}

	public void setProductD(List<ProductDetails> productD) {
		this.productD = productD;
	}

	@Override
	public String toString() {
		return "Product [Id=" + Id + ", name=" + name + ", Brand=" + Brand + ", ExpDate=" + ExpDate + ", productD="
				+ productD + "]";
	}

	
	
}
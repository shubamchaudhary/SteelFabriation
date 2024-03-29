package com.project.etities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;






@Entity
@Table(name = "category")
public class Category {
	 
	 @Id
	 @Column(name = "cat_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	 private int id;
	
	

	private String name;
	 private String details;
	 
	 @Column(name = "created_timestamp", insertable = false, updatable = false)
	 @Temporal(TemporalType.TIMESTAMP)
	 private Date createdTimeStamp;
	
	 @OneToMany(mappedBy = "catId" , cascade = CascadeType.REMOVE)
	 private List<Product> productList;
	 
	 public Category() {
		 this.productList = new ArrayList<Product>();
	 }
	 
	 
	 
	 public Category(int id, String name, String details, Date createdTimeStamp, List<Product> productList) {
		this.id = id;
		this.name = name;
		this.details = details;
		this.createdTimeStamp = createdTimeStamp;
		this.productList = productList;
	}



	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public Date getCreatedTimeStamp() {
		return createdTimeStamp;
	}
	public void setCreatedTimeStamp(Date createdTimeStamp) {
		this.createdTimeStamp = createdTimeStamp;
	}
	public List<Product> getProductList() {
		return productList;
	}
	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}
//	public Category(String name, String details) {
//		this.name = name;
//		this.details = details;
//		this.productList = new ArrayList<Product>();
//	}

	@Override
	public String toString() {
		return "Category [id=" + id + ", name=" + name + ", details=" + details + ", createdTimeStamp="
				+ createdTimeStamp + ", productLsit=" + productList + "]";
	}
	 
	 
	 
	 
}

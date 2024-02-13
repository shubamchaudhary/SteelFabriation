package com.project.etities;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="review")
public class Review {
	

	
	@Id
	@Column(name="r_id")
	@GeneratedValue
	private int rId;
	
	private String description;
	private int star;
	
	
	@Column(name="p_id")
	private int pId;
	
	@Column(name="c_id")
	private int cId;

	private Product product;
	
	public int getrId() {
		return rId;
	}

	public void setrId(int rId) {
		this.rId = rId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Review [rId=" + rId + ", description=" + description + ", star=" + star + ", pId=" + pId + ", cId="
				+ cId + "]";
	}

	public int getStar() {
		return star;
	}

	public void setStar(int star) {
		this.star = star;
	}

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public int getcId() {
		return cId;
	}

	public Review(String description, int star, int pId, int cId) {
		super();
		this.description = description;
		this.star = star;
		this.pId = pId;
		this.cId = cId;
	}

	public void setcId(int cId) {
		this.cId = cId;
	}

	
	
   public Review()
   {
	   
   }
@Autowired
public void setProduct(Product product) {
	this.product=product;
}
   
}

package com.experience.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="allergy")
public class Allergy {

	//properties
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="allergyname")
	private String allergyname;
	
	@Column(name="medicine")
	private String medicine;
	
	@Column(name="amount")
	private Double amount;
	
	//setters & getters
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getAllergyname() {
		return allergyname;
	}
	public void setAllergyname(String allergyname) {
		this.allergyname = allergyname;
	}

	public String getMedicine() {
		return medicine;
	}
	public void setMedicine(String medicine) {
		this.medicine = medicine;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}

	// toString
	@Override
	public String toString() {
		return "Allergy [id=" + id + ", allergyname=" + allergyname + ", medicine=" + medicine + ", amount=" + amount
				+ "]";
	}
	
}

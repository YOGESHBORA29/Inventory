package com.coforge.training.ims.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="address")
public class Address {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long addressId;

	private String street;
	private String city;
	private int pincode;
	
	/*The @JoinColumn annotation combined with a @OneToOne mapping
	 *  indicates that a given column in the owner 
	 * entity refers to a primary key in the reference entity*/
	@OneToOne
	@JoinColumn(name = "dealer_id")
	private Dealer dealer;

	public Long getAddressId() {
		return addressId;
	}

	public void setAddressId(Long addressId) {
		this.addressId = addressId;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public Dealer getDealer() {
		return dealer;
	}

	public void setDealer(Dealer dealer) {
		this.dealer = dealer;
	}
	
	
	
}

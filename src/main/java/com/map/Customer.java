package com.map;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class Customer {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int customer_id;
	private String customer_name;
	private String customer_city;
	private String customer_number;
	
	
	@OneToMany(mappedBy ="customer")
	private Set<Policy> policy;


	public int getCustomer_id() {
		return customer_id;
	}


	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}


	public String getCustomer_name() {
		return customer_name;
	}


	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}


	public String getCustomer_city() {
		return customer_city;
	}


	public void setCustomer_city(String customer_city) {
		this.customer_city = customer_city;
	}


	public String getCustomer_number() {
		return customer_number;
	}


	public void setCustomer_number(String customer_number) {
		this.customer_number = customer_number;
	}


	public Set<Policy> getPolicy() {
		return policy;
	}


	public void setPolicy(Set<Policy> policy) {
		this.policy = policy;
	}


	@Override
	public String toString() {
		return "Customer [customer_id=" + customer_id + ", customer_name=" + customer_name + ", customer_city="
				+ customer_city + ", customer_number=" + customer_number + ", policy=" + policy + "]";
	}
	
	
	
}

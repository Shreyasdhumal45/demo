package com.d;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="userdetails")
public class User {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private  int user_id;
private String name;
private String city;

@ManyToMany(cascade=CascadeType.ALL)
private List<Policy>policylist;
public int getUser_id() {
	return user_id;
}
public void setUser_id(int user_id) {
	this.user_id = user_id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public List<Policy> getPolicylist() {
	return policylist;
}
public void setPolicylist(List<Policy> policylist) {
	this.policylist = policylist;
}


}

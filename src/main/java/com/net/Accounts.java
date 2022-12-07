package com.net;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="account")
public class Accounts {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	
private int id;
private String acType;
private String acStatus;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}
public String getAcType() {
	return acType;
}

public void setAcType(String acType) {
	this.acType = acType;
}

public String getAcStatus() {
	return acStatus;
}

public void setAcStatus(String acStatus) {
	this.acStatus = acStatus;
}



public Accounts(String acType, String acStatus, Employee employee) {
	super();
	this.acType = acType;
	this.acStatus = acStatus;

}

@Override
public String toString() {
	return "Accounts [id=" + id + ", acType=" + acType + ", acStatus=" + acStatus + "]";
}



}
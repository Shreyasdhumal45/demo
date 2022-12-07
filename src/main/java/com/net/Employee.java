package com.net;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="emp")
public class Employee {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int emp_id;
	private String empName;
	private String empmail;
	
	@ManyToOne(cascade=CascadeType.ALL)
	private Accounts account;

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpmail() {
		return empmail;
	}

	public void setEmpmail(String empmail) {
		this.empmail = empmail;
	}

	public Accounts getAc() {
		return account;
	}

	public void setAc(Accounts ac) {
		this.account= ac;
	}

	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", empName=" + empName + ", empmail=" + empmail + ", ac=" + account + "]";
	}
	
	
}

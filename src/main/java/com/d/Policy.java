package com.d;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="policydetails")
public class Policy {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int policy_id;
private String policyName;
private String policyStatus;

@ManyToMany(mappedBy="policylist")
private List<User> userlist;

public int getPolicy_id() {
	return policy_id;
}
public void setPolicy_id(int policy_id) {
	this.policy_id = policy_id;
}
public String getPolicyName() {
	return policyName;
}
public void setPolicyName(String policyName) {
	this.policyName = policyName;
}
public String getPolicyStatus() {
	return policyStatus;
}
public void setPolicyStatus(String policyStatus) {
	this.policyStatus = policyStatus;
}
public List<User> getUserlist() {
	return userlist;
}
public void setUserlist(List<User> userlist) {
	this.userlist = userlist;
}

}

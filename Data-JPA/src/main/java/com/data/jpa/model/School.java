package com.data.jpa.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class School {
	
	@Id
	private Integer userid;
	private Integer rollNo;
	private String firstName;
	private String lastName;
	
	public School() {
		
	}

	public School(Integer userid, Integer rollNo, String firstName, String lastName) {
		super();
		this.userid = userid;
		this.rollNo = rollNo;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public Integer getRollNo() {
		return rollNo;
	}

	public void setRollNo(Integer rollNo) {
		this.rollNo = rollNo;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "School [userid=" + userid + ", rollNo=" + rollNo + ", firstName=" + firstName + ", lastName=" + lastName
				+ "]";
	}
	
	
	
	

}

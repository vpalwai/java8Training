package com.student.model;/*
* <p>
* This component and its source code representation are copyright protected
* and proprietary to The Trivera Group, Inc., Worldwide D/B/A Trivera Technologies
*
* This component and source code may be used for instructional and
* evaluation purposes only. No part of this component or its source code
* may be sold, transferred, or publicly posted, nor may it be used in a
* commercial or production environment, without the express written consent
* of the Trivera Group, Inc.
*
* Copyright (c) 2018 The Trivera Group, Inc.
* http://www.triveratech.com   http://www.triveragroup.com
* </p>
* @author The Trivera Group Tech Team.
*/

import com.student.location.Address;

public class Student {
	protected String name = "TBD";
	private String phoneNumber = "TBD";
	private String email = "TBD";
	private String studentNumber = "TBD";
	private double gpa = 0.0;

	public Student(String name){
		this.name = name;
	}

	private Address residency = null;
	
	public Address getResidency() {
		return residency;
	}
	public void setResidency(Address newResidency) {
		this.residency = newResidency;
	}
	
	public String getName() {
		return name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public boolean isEligibleToEnroll() {
		return true;
	}

	public void speak() {
		System.out.println("My name is " + name);
	}

}

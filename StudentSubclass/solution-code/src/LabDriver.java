/*
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
 
public class LabDriver {
	
	public static void main(String args[]) {
		Student studentA = new Student();
		studentA.setName("Troy");
		studentA.setStudentNumber("0001");
		Address tempAddress = new Address();
		tempAddress.setCity("Ozone");
		tempAddress.setState("Idaho");
		studentA.setResidency(tempAddress);
		
		Student studentB = new Student();
		studentB.setName("Jane");
		studentB.setStudentNumber("0002");
		tempAddress = new Address();
		tempAddress.setCity("Kukolumba");
		tempAddress.setState("Mitchaka");
		studentB.setResidency(tempAddress);	

		ExchangeStudent studentC = new ExchangeStudent();
		studentC.setName("Dan");
		studentC.setStudentNumber("0003");
		tempAddress = new Address();
		tempAddress.setCity("Melbourne");
		tempAddress.setCountry("Australia");
		studentC.setResidency(tempAddress);	
		
		studentA.speak();
		studentA.getResidency().printLabel();
		studentB.speak();
		studentB.getResidency().printLabel();		
		studentC.speak();
		studentC.getResidency().printLabel();	
	}

}
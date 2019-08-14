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
		Student[] allStudents = new Student[3];
		
		Student studentA = new Student();
		studentA.setName("Troy");
		studentA.setStudentNumber("0001");
		studentA.setGpa(2.22);
		Address tempAddress = new Address();
		tempAddress.setCity("Ozone");
		tempAddress.setState("Idaho");
		studentA.setResidency(tempAddress);
		allStudents[0] = studentA;
		
		Student studentB = new Student();
		studentB.setName("Jane");
		studentB.setStudentNumber("0002");
		studentB.setGpa(3.22);
		tempAddress = new Address();
		tempAddress.setCity("Kukolumba");
		tempAddress.setState("Mitchaka");
		studentB.setResidency(tempAddress);	
		allStudents[1] = studentB;

		ExchangeStudent studentC = new ExchangeStudent();
		studentC.setName("Dan");
		studentC.setStudentNumber("0003");
		studentC.setGpa(3.7);
		tempAddress = new Address();
		tempAddress.setCity("Melbourne");
		tempAddress.setCountry("Australia");
		studentC.setResidency(tempAddress);	
		allStudents[2] = studentC;
		
		for (int a = 0; a < allStudents.length; a++){
			System.out.println(allStudents[a].getName() + " ");
		};
		System.out.println("-------------");
		
		StringBuilder collector = new StringBuilder();
		for (int a = 0; a < allStudents.length; a++){
			collector.append(allStudents[a].getName()).append(" ");
		};
		System.out.println(collector.toString());
		System.out.println("-------------");
		
		for (Student student: allStudents){
			System.out.println(student.getName());
			Address thisAddress = student.getResidency();
			thisAddress.printLabel();
		};
		System.out.println("-------------");
		for (Student student: allStudents){
			student.speak();
		}
		System.out.println("-------------");
		int counter = 0;
		for (Student student: allStudents){
			if (student.getGpa() > 3.00)
				counter = counter + 1;
		};
		System.out.println("> 3.00: " + counter);
	}

}

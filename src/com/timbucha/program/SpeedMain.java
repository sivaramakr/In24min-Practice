package com.timbucha.program;

public class SpeedMain {

	public static void main(String[] args) {
		
	//	SpeedConverter.toMilesPerHour(9.5);
		
	 SpeedConverter.printConversion(120);
	 
	 //constructor
	 
	 
	 ConstructorExample person1 = new ConstructorExample();
	 person1.getName();
	 System.out.println(person1);
	// System.out.println(person1);
	 
	 ConstructorExample person2 = new ConstructorExample("person2");
	 person2.getName();
	 System.out.println(person2);
	// System.out.println(person1);
	 
	 
	 ConstructorExample person3 = new ConstructorExample("person3",56233,"person@gmail.com");
	 String name = (String) person3.getName();
	 System.out.println(person3);
	 System.out.println(name);
	 
	 person1.Stricon(56);
	 
	}
	
	
}

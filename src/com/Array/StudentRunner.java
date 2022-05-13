package com.Array;

public class StudentRunner {

	
	public static void main(String[] args) {
		int[] marks = {56,87,78};
		
		Student stu = new Student("siva", marks);
		int sum = stu.totalSum();
		//int avg =stu.avg();
		int min = stu.min();
		int max = stu.max();
		System.out.println(sum);
		//System.out.println(avg);
		System.out.println(min);
		System.out.println(max);
		
	}
	
}

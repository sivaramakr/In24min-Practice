package com.Array;

public class Student {

	
	
	
	private String name;
	private int[] marks;

	public Student(String name , int[] marks) {
		this.name = name;
		this.marks=marks;
	}

	public  int totalSum() {
		int sum =0;
		for(int mark:marks) {
	       sum += mark;
		}
		return sum;
	}

	public int avg() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int max() {
		int max = 0;
		for (int mark : marks) {
		if(mark > max) {
			
			max = mark;
		}
		}
		return max;
	}

	public int min() {
		int min=500;
		for (int mark : marks) {
			if (mark < min) {
			min = mark;
		}
		}
		return min;
	}
}

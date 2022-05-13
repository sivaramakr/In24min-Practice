package com.Array;

import java.util.Arrays;
import java.util.Scanner;

public class TimArray {





	public static void main(String[] args) {

		
		int[] myinteg= getIntegers(5);
	//	printArray(getIntegers(5));
	//	sortedArray(myinteg);
		printArray(sortedArray(myinteg));
	}


	public static int[] getIntegers(int capacity) {
		Scanner sc = new Scanner(System.in);

		int[] array = new int [capacity];
		System.out.println( "enter array numbers");

		for( int i=0;i<array.length;i++) {
			
			array[i]= sc.nextInt();
		}

		//System.out.println(Arrays.toString(array));
		return array;
	}

	
	public static int[] printArray(int[] array) {
		
		
		for (int i=0;i<array.length;i++) {
			
			System.out.println("element"+i+"  "+array[i]);
		}
		
		return  array;
		
		}
	
	
	public static int[] sortedArray(int[] array) {
		
		int[] sortedArray = new int[array.length];
		
		for(int i =0;i<array.length;i++) {
			
			sortedArray[i] = array[i];
		}
		
		boolean flag = true;
		int temp = 1000;
		while(flag) {
			
			flag = false;
			
//			for(int i =1;i<sortedArray.length-1;i++) {
//				
//				if (sortedArray[i]<sortedArray[i+1]) {
//					temp = sortedArray[i];
//					sortedArray[i]= sortedArray[i+1];
//					sortedArray[i+1]= temp;
//					
//					flag =true;
//					
//				}
//			}
			
			///////////////////////////////
			
			for(int arr : sortedArray) {
			     
				if( arr< temp)
				   
					temp = arr;
				
				
					
				System.out.println(temp);
				

//				if (arr > temp ) {					
//					temp =arr;
					
			}
			//	System.out.println(temp);
				}
		flag = true;

					
				
				
			
		
		return sortedArray;
	}
	
		


}	
	





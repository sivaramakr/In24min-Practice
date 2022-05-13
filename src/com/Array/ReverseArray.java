package com.Array;

import java.util.Arrays;

public class ReverseArray {
	
	
	public static void main(String[] args) {
		
		int[] array = {6,8,2,4,6,5,1,3};
		
	//	int[] arr = new int[8];
		
	//reverse(array);
	 System.out.println(Arrays.toString(desending(array)));
	
   //  System.out.println(Arrays.toString(reverseArray(array)));
		 
	}
	
	
	public static int[] reverseArray(int[] array) {
		
		int maxIndex= array.length-1;
		int halfLength = array.length/2;
		
		for(int i=0;i<halfLength;i++) {
			
		int	temp=array[i] ;
		
		
		 array[i]= array[maxIndex-i];
		
		 array[maxIndex-i]=temp;
		
		}
		return array;
		
		
		
		
	}
	
	
	
	
	 
	
	public static int[] desending(int[] array) {
		 int temp=0;
		 
		 boolean flag = true;
		 while(flag) {
			 
			 flag = false;
		for(int i = 0;i<array.length-1;i++)
		
		{
			if(array[i]<array[i+1]) {
			temp=array[i];
			array[i]=array[i+1];
			array[i+1]=temp;
			flag = true;
			//System.out.println(array[i]);
			}
		}
		
		
		
		 }
		return array;
	}
	
	
	

}

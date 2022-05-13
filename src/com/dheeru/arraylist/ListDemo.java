package com.dheeru.arraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {

		List<Integer> lis = new ArrayList<>();

		lis.add(1);
		lis.add(2);
		lis.add(3);
		lis.add(4);
		lis.add(null);
		System.out.println(lis);
		lis.remove(4);
		System.out.println(lis);

		///removes the element before index in collection interface 
		
		Collection<Integer> lis2 = new ArrayList<>();

		lis2.add(1);
		lis2.add(2);
		lis2.add(3);
		lis2.add(4);
		lis2.add(5);
		System.out.println(lis2);
		lis2.remove(4);
		System.out.println(lis2);
		
		
		List<Integer> lis3 = new LinkedList<>();

		lis3.add(1);
		lis3.add(2);
		lis3.add(3);
		lis3.add(4);
		lis3.add(null);
		System.out.println(lis3);
		lis3.remove(4);
		System.out.println(lis3);
	}

}

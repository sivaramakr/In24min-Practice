package com.java.features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ComparatorDemo {
	
	public static void main(String[] args) {
		
	
	List <Integer>lis = new ArrayList<>();
	
	lis.add(1);
	lis.add(2);
	lis.add(3);
	lis.add(4);
	lis.add(5);
	lis.add(6);
	lis.add(6);
	lis.add(5);
	//lis.add("hhchc");
	
	
	System.out.println(lis);
	
	List<Integer> l2 =lis.stream().filter((s)->s%2==0).collect(Collectors.toList());
	System.out.println(l2);
	
	Comparator<Integer> comp = (I1,I2)->(I1<I2)?1:(I1>I2)?-1:0;
	
	System.out.println("after sorting");
	
	Collections.sort(lis, comp);
	
	System.out.println(lis);

}
}
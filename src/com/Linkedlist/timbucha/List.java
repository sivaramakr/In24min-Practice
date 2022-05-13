package com.Linkedlist.timbucha;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class List {
	
	public static void main(String[] args) {
		
		LinkedList<String>places = new LinkedList<String>();
		
		places.add("chennai");
		places.add("Hyderabad");
		places.add("banglore");
		places.add("kolkatta");
		places.add("pune");
		
		printCities(places);
		
		addInOrder(places, "chennai");
		addInOrder(places, "Hyderabad");
		addInOrder(places, "banglore");
		addInOrder(places, "pune");
		addInOrder(places, "kolkatta");
		
		printCities(places);
		
	}
	
	public static void printCities(LinkedList<String> linkedList) {
		
		Iterator<String> iter = linkedList.iterator();
		
		while(iter.hasNext()) {
			
			System.out.println(iter.next());
		}
	}
	
	public static boolean addInOrder(LinkedList<String> linkedlist, String cities) {
		
		ListIterator<String> iterlist = linkedlist.listIterator(); 
		
		
		
		while(iterlist.hasNext()) {
			int comparision = iterlist.next().compareTo(cities);
		if	(comparision==0) {
			
			System.out.println("city alrteady included");
			return false;
		}
		else if (comparision>0) {
			
			iterlist.previous();
			iterlist.add(cities);
		}
		else if (comparision>0) {
			
			iterlist.add(cities);
		}
                if(iterlist.hasNext()) {
			
			System.out.println(iterlist.next());
		}
	}
		return true;
	}

	
}

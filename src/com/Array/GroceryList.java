package com.Array;

import java.util.ArrayList;

public class GroceryList {


	ArrayList<String> grocerylist = new ArrayList<>();



	public String addItems(String item) {

    grocerylist.add(item);
   // System.out.println("item added "+item);
    return null;
	}
	
	
	public String modifyItems(int position ,String item) {
		
	grocerylist.set(position, item)	;
	
	System.out.println("item modified "+(position+1)+"="+item );
	return item;
	
	}
	
	
	public String printItems() {
		
		for (int i=0;i<grocerylist.size();i++) {
		
		System.out.println("grocerylist"+"   ="+grocerylist.get(i));
		}
		return null;
				
	}
	
	public void findItem(String item) {
		
		boolean presitem = grocerylist.contains(item);
		if(presitem == true) {
		System.out.println("item already exist"+ item);
		}
		else {
			System.out.println("item not found in grocery list");
		}
	}
	
	public void removeItem(String item) {
		
		grocerylist.remove(item);
		
		System.out.println("item removed "+item);
	}
	

	}
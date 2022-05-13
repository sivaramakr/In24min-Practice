package com.Array;

import java.util.Scanner;

public class GroceryMain {


	static Scanner sc = new Scanner(System.in);
	static GroceryList gr = new GroceryList();
	public static void main(String[] args) {


		boolean quit =false;

		System.out.println("Grocery List  enter choice");
		


		while(!quit) {
			int choice =sc.nextInt();
			switch (choice) {
			case 1: gr.printItems();
			break;
			
			case 2:System.out.println("enter items to add");
			String   items =sc.next();
			gr.addItems(items);

			break;

			case 3:System.out.println("enter position and item");
			int position = sc.nextInt();
			String   items2 =sc.nextLine();
			gr.modifyItems(position, items2);
			break;


			case 4:System.out.println("enter  item to remove");
			String item4 =sc.next(); 
			
				gr.removeItem(item4);
			break;


			case 5 :System.out.println("enter item to find");
			String item3 =sc.next(); 
				gr.findItem(item3);
			break;

			case 6 :quit = true;
			break;
			}

			}










		}






	}




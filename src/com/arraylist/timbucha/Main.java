package com.arraylist.timbucha;

import java.util.Scanner;

public class Main {

   
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MobilePhone mp = new MobilePhone("8555036954");
		
		phoneStarting();
		printActions();
		boolean quit = false;
		while (!quit) {
			System.out.println("enter the choice");
			int choice =  sc.nextInt();
			   sc.nextLine();
			
			switch (choice) {
			
			case 0:System.out.println("Shutting down"); 
			 quit = true;
			 break;
			 
			case 1 : mp.printContacts();
			break;
			
			case 3: System.out.println("enter old contact name");
			     String oldcontact =  sc.nextLine();
			     System.out.println("enter old phone");
			     String phone =  sc.nextLine();
			     System.out.println("enter new contact name");
			     String newcontact =  sc.nextLine();
			     System.out.println("enter new phone");
			     String  newphone =  sc.nextLine();
				Contact oldcont = new Contact(oldcontact, phone);
				Contact newcont = new Contact(newcontact, newphone);
			
				mp.updateContact(oldcont, newcont);
				
			break;
			 
			
			case 4:System.out.println("enter contact name to remove");
			   String  name =   sc.nextLine();
			   System.out.println("enter contact phone to remove");
			   String  num =   sc.nextLine();
			   
			   Contact num1 = new Contact(name, num);
				mp.removeContact(num1);
			
			break;
			
			
			
			case 5 :
				
				System.out.println("enter contact name to add");
			   String  namenew =   sc.nextLine();
			   System.out.println("enter contact phone to add");
			   String  numnew =   sc.nextLine();
			   Contact num1new = new Contact(namenew, numnew);
				mp.addContacts(num1new);
			
			
		}
		
		}
		
		
		
		
		
	}
		
		private static void printActions() {
		// TODO Auto-generated method stub
			System.out.println("\n available actions:\npress" );
			System.out.println("0 to shutdown\n"+"1 to print contacts\n"
			        +"3 to update existing contacts\n"
					+ "4 to remove an existing contact \n"
					+ "5 query if an existing contact exist\n"
					+ "6 to print list of available actions\n");
			
		
	}

		public static void phoneStarting() {
			System.out.println("phone Started...");
			
		}
		
		
			
		}
		
	


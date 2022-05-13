package com.arraylist.timbucha;

import java.util.ArrayList;

public class MobilePhone {

	private String myNumber;
	private ArrayList<Contact> myContacts = new ArrayList<Contact>();








	public MobilePhone(String myNumber) {
		super();
		this.myNumber = myNumber;
		this.myContacts = new ArrayList<Contact>() ;
	}


	public boolean updateContact(Contact  oldContact,Contact newContact) {
		int	 findPosition = findContact(oldContact);
		if (findPosition<0) {

			return false;}

		this.myContacts.set(findPosition, newContact);

		System.out.println("changed sucessfully");

		return true;
	}


	public String queryContact(Contact contact) {
		if(findContact(contact)>=0) {
			return contact.getName();
		}


		return null ;


	}



	public boolean removeContact(Contact contact) {
     
		int findcont = findContact(contact);
		
		if(findcont<0) {			

		return false;
		}
			
          myContacts.remove(contact);
          return true;

	}







	public boolean addContacts(Contact contact ) {
		//if(findContact(contact.getName())>=0) {
		//	System.out.println("Already Exist");
		//	return false;
		//}
		return myContacts.add(contact);

	}

	public  void printContacts() {
		for(int i=0;i<myContacts.size();i++) {
			
			
			System.out.println((i+1)+""+myContacts.get(i).getName()+"="+myContacts.get(i).getPhoneNumber());
			
		}
	}



	private int findContact(Contact contact) {


		return myContacts.indexOf(contact);

	}

	private int findContact(String name) {
		for (int i =0;i>=myContacts.size();i++) {
			Contact contact	=myContacts.get(i);

			if( contact.getName().equals(name)) {
				System.out.println("contact already exist" ); 


				return i;
			}
		}
		return -1;

	}
	

		


	

}
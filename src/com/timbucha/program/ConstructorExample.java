package com.timbucha.program;

public class ConstructorExample {
	
	private Object name;
	private Object credit;
	private Object email;
	
	
	
	
	
	public ConstructorExample() {
		this("default",50000,"default@gmail.com");
		
	}
	public ConstructorExample(String name) {
		this("person2",40000,"person2@gmail.com");
	}
    
	public ConstructorExample(String name,int credit,String email) 
	{
	this.name = name;
	this.credit= credit;
	this.email=email;
	
	}
	public Object getName() {
		return name;
	}
	public void setName(Object name) {
		this.name = name;
	}
	public Object getCredit() {
		return credit;
	}
	public void setCredit(Object credit) {
		this.credit = credit;
	}
	public Object getEmail() {
		return email;
	}
	public void setEmail(Object email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "ConstructorExample [name=" + name + ", credit=" + credit + ", email=" + email + "]";
	}

	public void Stricon(int hours) {
		
		String concatstring = hours +"int converted int String";
		
		System.out.println(concatstring);
		
		
	}
	
	
	
}

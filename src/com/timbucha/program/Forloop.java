package com.timbucha.program;

public class Forloop {
	
	
	
	public static void main(String[] args) {
		
		
		int i = 1;
		int count = 0;

		for(i=1;i<1000;i++) {
	     
			if ((i%3==0)&&(i%5==0)) {
				
				System.out.println(i);
				
				 ++count;
				 
				
				if (count == 5) {
					
					break;
			
				
			}
			}
			
			
		}
		
		
	}

}

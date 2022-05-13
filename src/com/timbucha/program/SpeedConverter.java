package com.timbucha.program;

public class SpeedConverter {
	
	
	
	public static long toMilesPerHour(double kilometers) {
		
		if (kilometers<1) {
			
			return -1;
		}	
		//long miles = (long) (kilometers/1.609)	;
		
		long miles = Math.round(kilometers/1.609);
		System.out.println(miles);
		return miles;
	}

	public static void printConversion(double kilometers) {
		
	          double conmile=toMilesPerHour(kilometers);
		
		System.out.println(kilometers+" km/h= "+conmile+"  mm/h  ");
	}
}

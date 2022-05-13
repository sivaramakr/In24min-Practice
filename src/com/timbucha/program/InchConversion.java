package com.timbucha.program;

public class InchConversion {


	public static double inchConvert(double feet,double inch) {

		if(feet<=0||inch<0||inch>12) {
			System.out.println("invalid details");
			return -1;
		}


		double centimeters = (feet*12)*2.54;  //converting feet into centimeters
		centimeters += inch*2.54;             //converting inches into centimeters

		System.out.println("centimeters="+centimeters);
		return centimeters;

	}
	public static void main(String[] args) {
		inchConvert(6, 11);
		System.out.println(inchConvert(7, 5));

	}
}















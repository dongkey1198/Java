package org.opentutorials.javatutorials.umberstring;

public class TypeConvrsion {
	
	public static void main(String[] args) {
		
		double a = 3.0F; //float을 double 형에 대입할경우 자동으로 double형으로 형변환된다.
		
		//float a = 3.0; double형이 float형보다 데이터 값이 크기때문에 double => float으로 자동 형변환이 불가하다.
		
		/*
		 byte => short 
		 				=> int => long => float => double
		 		 char
		 */
		
		float b = (float)100.0;
		int d = (int)100.0f;
		
		
	}
}

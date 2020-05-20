package dngky;

import java.util.Scanner;

public class E0202 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double circumference; // 운둘래
		double circularArea; // 원넓이
		
		Scanner scan = new Scanner(System.in);
		System.out.print("운의 반지름을 입력하세요: ");
		int radius = scan.nextInt();
		
		circumference = 2 * radius * 3.14;
		circularArea = radius * radius * 3.14;
		
		System.out.println("원둘래: " + circumference + "\n" + "원넓이: " + circularArea );
	}

}

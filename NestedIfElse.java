package dngky;

import java.util.Scanner;

public class NestedIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int age;
		
		System.out.print("Enter your age: ");
		age = sc.nextInt();
		
		if(age < 8) {
			System.out.println("age: " + age + "\t(애기)");
		}
		else if(age > 7 && age < 14 ) {
			System.out.println("age: " + age + "\t(초등학생)");
		}
		else if(age > 13 && age <17 ) {
			System.out.println("age: " + age + "\t(중학생)");
		}
		else if(age > 16 && age < 20) {
			System.out.println("age: " + age + "\t(고등학생)");
		}
		else
			System.out.println("age: " + age + "\t(성인)");
	}
		
}




package dngky;

import java.util.Scanner;

public class E0203 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("문자를 입력하시오: ");
		char a = scan.nextLine().charAt(0);
		int ascii = (int)a;
		
		System.out.println(ascii);
		
	}

}

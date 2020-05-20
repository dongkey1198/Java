package dngky;

import java.util.Scanner;

public class E0204 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int num;
		System.out.print("숫자를 입력하세요: ");
		num = scan.nextInt();
		if(num<0) {
			System.out.println("Negative Number");
		}else {
			System.out.println("Positive Number");
		}
	}

}

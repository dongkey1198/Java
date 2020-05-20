package dngky;

import java.util.Scanner;

public class SwitchVal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int a;
		String b;
		
		System.out.print("매뉴를 고르세요[1.치킨, 2.피자, 3.짜장면]: ");
		a = sc.nextInt();
		
		switch(a) {
		
		case 1: b = "치킨"; break;
		case 2: b = "피자"; break;
		case 3: b = "짜장면"; break;
		default: b = "그딴거 없어 이씨발"; break;
		}
		
		System.out.println(b);
	}

}

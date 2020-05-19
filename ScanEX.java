package dngky;

import java.util.Scanner;

public class ScanEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Three different Words!!!");
		String s1 = scan.next();
		String s2 = scan.next();
		String s3 = scan.next();
		
		System.out.print("Enter Your Age: ");
		int age = scan.nextInt();
		
		System.out.print("Enter Your Weight: ");
		float weight = scan.nextFloat();
		scan.nextLine(); // 버퍼를 초기화하여 버퍼에서 <엔터를>를 삭제해야 정상작동!!!
		
		
		System.out.print("Enter Your Address: ");
		String address = scan.nextLine();
		scan.close();
		
		
		System.out.println(s1+"\t"+s2+"\t"+s3);
		System.out.println("Age: "+ age);
		System.out.println("Weight :" + weight);
		System.out.println("Address :" + address);
		
		Scanner sc = new Scanner("2030/08/15");
		sc.useDelimiter("/");
		while(sc.hasNext()) {
			System.out.print(sc.next()+"\t");
		}
		System.out.println("-----end------");
		sc.close();
	}

}

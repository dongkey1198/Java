package dngky;

import java.text.SimpleDateFormat;
import java.util.Date;

public class PrintEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 33;				//정수
		double y = 123.45;		//실수
		String str = "Java";	//문자열
		String s = "Ok";
		
		System.out.println("I can do it");
		System.out.println("x = " + x);
		System.out.println("x = " + x + "\t y = " + y);
				//\t는 tab
		System.out.println();
				//줄 바꾸기, 엔터 기능 \n
		System.out.println("str = " + str); //두개의 문자열 출력
		System.out.println(str + s);
				//두 개의 문자ㅕㅇㄹ 결합한 문자열 출력
		
		System.out.printf("%.2f", y); // 소수점 이하 2자리 출력
		System.out.println(y);
	}

}

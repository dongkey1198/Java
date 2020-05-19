package dngky;

import java.io.IOException;

public class ConsoleInput {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//System.in.rea()는 키보드에서 문자를 입력하고 enter 키를 누르면
		//입력 버퍼에 Enter 문자 \r\n 추가로 저장된다.
		//즉 System.in.rea()을 두번 사용하면 이 문자를 스킵할수잇다.
		// 이때 Systme.in.skip(2)를 사용하면 이를 방지할수잇따.
		System.out.println("하나의 문자 입력: ");
		int vi = System.in.read();	//아스키 코드로 변환하여 저장
		System.in.skip(2);	//<엔터 \r\n> 가 버퍼에 남아 있기에 2 문자 삭제
		
		System.out.println("하나의 문자 입력: ");
		int input = System.in.read();	//아스키 코드로 변환하여 저장
		System.in.skip(2);	//<엔터 \r\n> 가 버퍼에 남아 있기에 2 문자 삭제
		
		System.out.println("하나의 문자 입력: ");
		int input2 = System.in.read();	//아스키 코드로 변환하여 저장
		
		System.out.print(vi + " ");
		System.out.println((char) vi);
		System.out.println((char) input);
		System.out.println((char) input2);
		
	}

}

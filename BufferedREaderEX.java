package dngky;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedREaderEX {
		
	// throws IOException 는 System.in.read()
    // 사용시 오류 발생 처리 용도이다.
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a, b;
		System.out.print("정수 입력: ");
		a = Integer.parseInt(br.readLine());
		
		System.out.print("정수 입력: ");
		b = Integer.parseInt(br.readLine());
		
		System.out.println(a + "\t" + b);
		
		System.out.print("Enter the 3 characters: ");
		System.out.print((char) br.read()+ "\t");
		System.out.print((char) br.read()+ "\t");
		System.out.println((char) br.read());
		
		
		
		
	}

}

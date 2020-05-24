package dngky;
class MyClass {
	
	private static int iv = 0;
	
	void increment() {
		MyClass.iv = 10;	//static 선언되었기에 외부 클래스 객체 생성없이 직접 사용가능
		iv++;				//static 선언되었기에 같은 클래스 내에서는 필드명을 사용
	}
	
	public static String info() {
		//static 선언되었기에 객체 생성없지 직접사용
		return ("iv = " + iv);
	}
	
	public String toString() {
		return ("iv = " + iv);
	}
	
}

public class StaticDemo {
	public static void main(String[] args) {
		
		MyClass.info();
		
		MyClass a = new MyClass();
		a.increment();
		System.out.println(a);
	}
}

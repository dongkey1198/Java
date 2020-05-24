package dngky;

public class ConstructorEx {
	String name;
	int age;
	ConstructorEx(){ }
		// 기본 생성자: 정의하지 않으면 컴파일러가 자동 삽입
	
	@Override
	public String toString() {
		//기본 타입과 참조 타입이 혼합된 출력 형태
		return "Name: "+ name + "\tAge :" +  age;
		//Overriding 재정의
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorEx c = new ConstructorEx();
		c.age = 27;
		c.name = "김 동현";
		
		System.out.println(c);
	}

}

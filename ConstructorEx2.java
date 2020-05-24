package dngky;

public class ConstructorEx2 {
	String name;
	int age;
	
	//ConstructorEx2() {
	//} // 기본 생성자: 정의하지 않으면 new ConstructorEx2(); 는
	// 컴파일 오류
	
	ConstructorEx2(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Name: "+ name + "\tAge :" +  age;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorEx2 obj = new ConstructorEx2("김 동현", 37);
		System.out.println(obj);
		
		
	}

}

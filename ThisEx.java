package dngky;

public class ThisEx {
	
	String name;
	int age;
	
	ThisEx(){
		this("이기자"); // 생성자간 호출, ThisEx(String name) 생성자 호출
		//this("정도령", 30) //오류, 첫번째 문장이 아니기 때문
	}	//기본 생성자: 정의하지 않으면 new ThisEx(); 시 오류
	
	ThisEx(String name){
		this(name, 25);
		this.name = name;
	}
	
	ThisEx(int age){
		this.age =age;
	}
	
	ThisEx(String name, int age){
		this.name=name;
		this.age=age;
	}
	
	public String toString() {
		return "Name: "+ name + "\tAge :" +  age;
	}
	public static void main(String[] args) {
		ThisEx obj  = new ThisEx("홍길동", 20);
		ThisEx obj2 = new ThisEx("홍길동");
		ThisEx obj3 = new ThisEx(20);
		
		System.out.println(obj);
		System.out.println(obj2);
		System.out.println(obj3);
	}
}

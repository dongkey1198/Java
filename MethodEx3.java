package dngky;

public class MethodEx3 {
	
	String name;
	
	public String setName(String name) {
		return name;
		// new 통해 객체 생성해야 사용 가능
	}
	
	public void showMessage() {
		System.out.println("Java");
	}
	
	// static 없으면 객체 생성해야하지만, 존재: 객체 생성없이 직접 사용 가능
	
	public static void showMessage(String str) {
		System.out.println(str);
	}
	
	public static void main(String[] args) {
		
		showMessage("I can do it");
		
		MethodEx3 obj = new MethodEx3();
		obj.showMessage();
		
		String name = obj.setName("홍길동");
		
		System.out.println("일름: " + name);
		
	}
}

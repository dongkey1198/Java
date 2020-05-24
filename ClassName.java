package dngky;

public class ClassName {
	
	private String name; //필드(멤버변수), 비공개(private)으로  캡슐화
	
	public void setName(String n) {// 매개변수 있는 메소드
		name = n;				   // 필드 name에 매개변수 n의 값을 대입
	}
	
	public String getName() {// 매개벼수가 없는 메소드
		return name;		// 종료, 호출한 메소드로 name 값을 전달.
	}
	
	//자바 프로그램 시작은 main()를 호출해서 실행
	public static void main(String[] args) {
		ClassName obj = new ClassName();// 객채 생성
		obj.setName("김동현");
		
		System.out.println("내 이름은 " + obj.getName() + " 입니다.");
		
	}

}

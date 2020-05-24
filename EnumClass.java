package dngky;

enum AnimalCategory {
	DOG, CAT, LION, TIGER, ELEPHANT
}

class Animal{
	AnimalCategory type; // 필드, 열거된 5가지만 허용
	String size;			// 필드
	
	public void InitInfo( ) {
		this.type = AnimalCategory.DOG;
		this.size = "귀엽고 작다.";
		// this.필드, 여기서는 this.을 생량해도 같음
	}
	
	public void showInfo() {
		System.out.println("동물이름 : " + type);
		System.out.println("크기 : " +  size);
	}
}

public class EnumClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal obj = new Animal();
		obj.InitInfo(); //필드값을 지정한후
		obj.showInfo();// 출력해야함
	}

}

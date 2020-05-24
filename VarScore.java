package dngky;

public class VarScore {
	
	int varReturn(int a) {	// a 는 varReturn 메소드에서만 유효
		a ++;				// a 값이 1씩 증가
		return a;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1;
		
		VarScore obj = new VarScore();
		
		obj.varReturn(a);
		System.out.println(a); // 지역변수
		
		a = obj.varReturn(a);
		System.out.println(a);
	}

}

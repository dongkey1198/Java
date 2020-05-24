package dngky;
class F{
	
	String type;
	String color;
	String arrangement;
	double unitPrice;
	
	public F() { }
	
	public F(String t, String c, String a, double p) {
		type = t;
		color = c;
		arrangement = a;
		unitPrice = p;
	}
	
	public String toString() {
		return "이름: " + type + ", 색상: " + color + ", 준비: " +arrangement + ", 가격: "+ unitPrice;
	}
}

class Oja{
	//public Oja(){}
	
	public F[] showInfo() {
		
		F[] f = new F[3];
		f = new F[] {new F("카네이션","빨강","바구니",100.37),
				new F("장미","빨강","화병",100.37),
				new F("국화","흰색","꽃병",100.37)};
		
		for(F e : f) {
			System.out.println(e);
		}
		return f;
	}
}
public class Abc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Oja obj = new Oja();
		F[] f = obj.showInfo();

	}

}

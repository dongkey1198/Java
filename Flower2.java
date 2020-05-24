package dngky;

public class Flower2 {
	String type;
	String color;
	String arrangement;
	double unitPrice;
	
	public Flower2(String t, String c, String a, double p) {
		type = t;
		color = c;
		arrangement = a;
		unitPrice = p;
	}
	
	private static void showInfo(Flower2[] f) {
		f = new Flower2[] {new Flower2("카네이션","빨강","바구니",100.37),
			new Flower2("장미","빨강","화병",100.37),
			new Flower2("국화","흰색","꽃병",100.37)};
		
		for(Flower2 e : f) {
			System.out.println(e);
		}
	}
	
	public String toString() {
		return "이름: " + type + ", 색상: " + color + ", 준비: " +arrangement + ", 가격: "+ unitPrice;
	}
	
	public static void main(String[] args) {
		Flower2[] f = new Flower2[3];
		showInfo(f);
	}
}

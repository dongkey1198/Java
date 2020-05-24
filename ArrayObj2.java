package dngky;

class OA{
	private int[] prices;
	
	public int[] InitInfo() {
		prices = new int[] {3, 5, -7}; // 초기화
		return prices;
	}
}

public class ArrayObj2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OA obj = new OA();
		int[] ar = new int[4];
		
		ar = obj.InitInfo();
		for(int e : ar) {
			System.out.println(e);
		}
	}

}

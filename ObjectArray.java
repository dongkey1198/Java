package dngky;
class ArrayObj{
	
	private int[] prices;
		
		public ArrayObj() {
			prices = new int[3];
			// 3개의 요소를 넣을 수 있는 객체 배열 생성
			
			prices[0] = 88;
			prices[1] = 33;
			prices[2] = 5;
		}
		
		public void showInfo() {
			System.out.println(prices[0] + ", " + prices[1]+ ", "+ prices[2] );
		}
}

public class ObjectArray {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayObj obj = new ArrayObj();
		obj.showInfo();

	}

}

package dngky;
class A{
	
	private int[] prices;

	public void showInfo(int[] prices) {
		System.out.println(prices[0] + ", " + prices[1]+ ", "+ prices[2] );
	}
}
public class ArrayObj3 {
	public static void main(String[] args) {

		int prices [] = new int[] {3,5,-7};
		
		A obj = new A();
		
		obj.showInfo(prices);
	}

}

package dngky;

public class While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1;
		
		while(num <= 5) {
			System.out.println(num);
			num ++;
		}
		
		double num2 = 1; 
		while(num2 <= 6) {
			System.out.print(num2 + ", ");
			num2 = num2 + 0.5;
		}
		
		int num3 = 10;
		
		while(num3 != 15) {
			System.out.println(num3);
			num3++;
		}
	}
	
}

package dngky;

public class E0201 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 10;
		
		String bin = Integer.toBinaryString(num);
		String oct = Integer.toOctalString(num);
		String hex = Integer.toHexString(num);
		
		System.out.println("Binary: " + bin);
		System.out.println("Octal: "+ oct);
		System.out.println("Hex :" + hex);
	}

}

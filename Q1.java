package dngky;

class Employee{
	private String name;
	private String address;
	private String telephone;
	
	


	public Employee(String name, String address, String telephone){
		this.name = name;
		this.address = address;
		this.telephone = telephone;
	}

	

	
	public String toString() {
		return(name+"\t"+address+"\t"+telephone);
	}
}

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee("홍길동","서울시","010-1234-1234");
		System.out.println(e);
		
		
		
	}

}

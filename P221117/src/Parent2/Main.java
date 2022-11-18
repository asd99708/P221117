package Parent2;

public class Main {
	public static void main(String[] args) {
		Child2 c = new Child2("홍길동","123456-1234567", 1);
		
		System.out.println("name : " + c.name);
		System.out.println("ssn : " + c.ssn);
		System.out.println("childNo : " + c.ChildNo);
	}

}

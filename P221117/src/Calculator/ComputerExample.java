package Calculator;

public class ComputerExample {

	public static void main(String[] args) {
		int r =10;
		Calculator cl = new Calculator();
		System.out.println("원면적 : "+cl.areaCircle(r));
		System.out.println();
		
		Computer cp = new Computer();
		System.out.println("원면적 : "+ cp.areaCircle(r));
	}

}

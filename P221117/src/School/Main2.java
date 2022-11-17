package School;
import java.util.Scanner;

class School1 {
	String shname = "Jejuelementary";
	int sy = 6;

	School1(){
		System.out.printf("%d grade in %s School\n", this.sy, this.shname);		
	}
	
	void infoSchool(String shname, int sy) {
		System.out.printf("%d grade in %s School", sy, shname);
	}

}

public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String shname = sc.next();
		int sy = sc.nextInt();
		sc.close();
		
		School1 sh = new School1();
		sh.infoSchool(shname, sy);
	}
}
package School;
import java.util.Scanner;

class School {
	String shname = "Jejuelementary";
	int sy = 6;

	School(){
		System.out.printf("%d grade in %s School\n", this.sy, this.shname);		
	}
	
	void infoSchool(String shname, int sy) {
		System.out.printf("%d grade in %s School\n", sy, shname);
	}

}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		String shname = sc.next();
		int sy = sc.nextInt();			
		School sh = new School();
		sh.infoSchool(shname, sy);
		sc.close();
	}
}
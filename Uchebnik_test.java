package eddu.smg;
import java.util.Scanner;

public class Uchebnik_test {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	uchebnik[] students = new uchebnik[5];
 
		for(int i=0;i<5;i++) {
			System.out.println("Name of student" + (i+1)+ " ?");
			students[i].name= in.next();
			System.out.println("Average of student" + (i+1)+ " ?");
			students[i].average= in.nextDouble();
		}
	}

	public void uchenitsi (uchebnik[] st) {
		for(int i=0;i<5;i++) {
		if(st[i].stipendia(st[i])) {
			System.out.println(st[i].name);
		}
		}
	}

}

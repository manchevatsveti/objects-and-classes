package eddu.smg;
import java.util.Scanner;

public class uchebnik_test {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		uchenik[] students = new uchenik[5];
		String name;
		double average;
 
		for(int i=0;i<students.length;i++) {
			
			System.out.println("Name of student" + (i+1)+ " ?");
			name = in.next();
			System.out.println("Average of student" + (i+1)+ " ?");
			average = in.nextDouble();
			students[i]= new uchenik(name, average);
		}
		
		uchenitsi(students);
	}

	public static void uchenitsi (uchenik[] st) {
		for(int i=0;i<st.length;i++) {
		if(st[i].stipendia(st[i].getAverage())) {
			System.out.println(st[i].getName());
		}
	}
	}

}

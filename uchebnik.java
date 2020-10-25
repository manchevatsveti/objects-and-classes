package eddu.smg;

public class uchebnik {
public String name = new String("student");
public double average=2;

 uchebnik(){
 }
 uchebnik(String name, double average){
 }
	public boolean stipendia(uchebnik student) {
		if(student.average>=5.5) {
			return true;
		}
		else {
			return false;
		}
	}
}


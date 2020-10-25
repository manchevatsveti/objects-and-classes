package eddu.smg;

public class uchebnik {
private String name = new String();
private double average;

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
	public String getName() {
		return name;
	}
	public void setName(String n) {
		name = n;
	}
	public double getAverage() {
		return average;
	}
	public void setAverage(double a) {
		average=a;
	}
}


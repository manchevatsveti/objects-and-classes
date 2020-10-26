package eddu.smg;

public class uchenik {
private String m_name = new String();
private double m_average;

	 uchenik(){
	 }
 
	 uchenik(String name, double average){
		 m_name = name;
		 m_average = average;
	 }
 
	public boolean stipendia(double average) {
		if(average>=5.5 || average<6) {
			return true;
		}
		return false;
	}
	
	public String getName() {
		return m_name;
	}
	public void setName(String n) {
		m_name = n;
	}
	public double getAverage() {
		return m_average;
	}
	public void setAverage(double a) {
		m_average=a;
	}
}

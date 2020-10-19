package eddu.smg;

public class Savings {
	public double balance;
	public String name;
	public double InterestRate =0.01;
	
	public void deposit (double sum){
		balance += sum;
	}
	
	public void withdraw(double sum){
		if (sum<0 || sum>balance){
			System.out.println("Error");
			return;
		}
		balance -= sum;
		System.out.println("Successful withdraw of " + sum + "Your balance now is " + balance);
	}
}

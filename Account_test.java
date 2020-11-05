package eddu.smg;

public class Account_test {

	public static void main(String[] args) {
		Account a1 = new Account(1122,20000);
		Account.setYearInterestRate(4.5);
		a1.withdraw(2500);
		a1.deposit(3000);
		System.out.println("Balance: "+ a1.getBalance()+ " Monthly Interest: "+ a1.getMonthlyInterest()+ " Date: "+ a1.getDateCreated());
	}

}

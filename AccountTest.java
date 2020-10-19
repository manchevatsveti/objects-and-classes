package eddu.smg;

public class AccountTest {

	public static void main(String[] args) {
		Savings saver = new Savings();
				saver.name = "Tsveti";
		saver.balance = 1000;
		
		saver.deposit(50.98);
		saver.withdraw(300);
	}

}

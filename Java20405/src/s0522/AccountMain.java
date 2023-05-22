package s0522;

public class AccountMain {
	public static void main(String[] args) {
		Account a1 = new Account("김태희",101,8000);
		Account a2= new Account("배수지",102,0);
		a1.printInfo();
		a2.printInfo();
		a1.withdraw(5000);
		a2.deposlit(10000);
		a1.deposlit(1000);
		a2.withdraw(7000);
		a1.printInfo();
		a2.printInfo();
		a1.withdraw(5000);
	}
}

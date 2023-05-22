package s0522;

public class Account {
	private String name;
	private int no, balance;
	
	Account(){
		
	}
	Account(String name, int no){
		this.name=name;
		this.no=no;
	}
	Account(String name, int no, int balance){
		this(name, no);
		this.balance=balance;
	}
	String getName() {
		return name;
	}
	int getNo() {
		return no;
	}
	int getBalance() {
		return balance;
	}
	void setName(String name) {
		this.name=name;
	}
	void setNo(int no) {
		this.no=no;
	}
	void setBalance(int balance) {
		this.balance=balance;
	}
	public void printInfo() {
		System.out.println("[계좌정보] 예금주:"+name+" 계좌번호:"+no+" 현재잔고:"+balance);
	}
	public void deposlit(int money){
		balance+=money;
		System.out.println(name+"님 "+money+"원 입금");
	}
	public void withdraw(int money) {
		if(money>balance) {
			System.out.println(name+"님 "+money+"원 출금 실패-현재잔액 "+balance+"원");
		}else {
			balance-=money;
			System.out.println(name+"님 "+money+" 원 출금");
		}
		
	}

}

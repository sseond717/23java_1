package s0626;

public class BookMain extends Book{
	public static void main(String[] args) {
		System.out.println("로봇도서관의 현재 도서는 "+Book.getBookCnt()+"권 입니다");
		System.out.println("***********************************************************");
		
		Book b1 = new Book();
		b1.setNo(1); b1.setName("구름빵"); b1.setCount(10);
		b1.printInfo();
		
		Book b2 = new Book(102,"수박수영장"); b2.setCount(5);
		b2.printInfo();
		
		Book b3 = new Book(103, "강아지똥", 15, 0);
		
		b3.printInfo();
		
		System.out.println("***********************************************************");
		System.out.println("로봇도서관의 현재 도서는 "+Book.getBookCnt()+"권 입니다");
		System.out.println("***********************************************************");
		
		b1.borrowBook(15);
		b2.returnbook(2);
		b1.borrowBook(5);
		b3.borrowBook(10);
		b3.returnbook(5);
		
		System.out.println("***********************************************************");
		
		b1.printInfo();
		b2.printInfo();
		b3.printInfo();
		
	}
}

package s0619_1;

public class BookMain {
	public static void main(String[] args) {
		System.out.println(Book.getLibrary()+" 의 현재 도서는"+ Book.getBookCnt()+ "종 입니다");
		System.out.println("*****************************************");
		Book b1 = new Book();
		
		b1.setNo(101); b1.setName("구름빵"); b1.setCount(10);
		b1.printInfo();
		
		Book b2 = new Book(102, "수박수영장"); b2.setCount(5);
		b2.printInfo();
		
		Book b3 = new Book(103,"강아지똥", 15, 0);
		b3.printInfo();
		
		System.out.println("*****************************************");
		System.out.println(Book.getLibrary()+" 의 현재 도서는 "+ Book.getBookCnt()+ "종 입니다");
		System.out.println("*****************************************");

		b1.borrowBook(15);
		b2.returnBook(2);
		b1.borrowBook(5);
		b3.borrowBook(10);
		b3.returnBook(5);
		
		System.out.println("*****************************************");
		
		b1.printInfo();
		b2.printInfo();
		b3.printInfo();
	}

}

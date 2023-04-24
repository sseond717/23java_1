package s0417;

public class StudentMain {
	public static void main(String[] args) {
		Student hong = new Student();
		Student kim = new Student();
		Student lee = new Student("이지은",20,2,789,48);
		lee.printAll(); System.out.println();
		hong.age= 10;	hong.grade=3;	hong.name="홍길동";	hong.number=25;
		hong.printAll(); System.out.println();
		kim.age=12; kim.grade=5; kim.name="김현강"; kim.number=55;
		kim.printAll();
	}

}

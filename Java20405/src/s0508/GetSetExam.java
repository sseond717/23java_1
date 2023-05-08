package s0508;

public class GetSetExam {
	public static void main(String[] args) {
		Student kim = new Student();
		System.out.println(kim.getName());
		kim.setName("김민준");
		System.out.println(kim.getName());
		kim.setGrage(3);
		System.out.println(kim.getName()+"은(는) "+kim.getGrage()+"학년 입니다.");
		
		Student minn= new Student();
		minn.setName("김민준");
		minn.setGrage(2);
		minn.setScore(12);
		minn.printAll();
	}
}

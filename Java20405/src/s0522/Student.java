package s0522;

public class Student {
	private String name = "이름없음";
	private int grade = 0;
	private double score;
	static int count = 0;
	static String SchoolName = "서로고";
	static final Double PI = 3.141592;

	Student() {// 생성자 : 공통으로 작업할 내용을 작성
		count++; // 생성할때 마다 학생수를 증가시키려는 목적
	}

	Student(String name, int grade) {
		this();//생성자 호출 여기선 카운트를 증가시키고 등등등 
		this.name = name;
		this.grade = grade;
	}

	// 이름을 저장
	void setName(String name) {
		this.name = name;
	}

	// 이름을 리턴
	String getName() {
		return name;
	}

	void setGrage(int grade) {
		this.grade = grade;
	}

	int getGrage() {
		return grade;
	}

	void print() {
		System.out.println(count +"번째 학생 이름은 " + getName() + "이고 " + getGrage() + "학년");
	}

}

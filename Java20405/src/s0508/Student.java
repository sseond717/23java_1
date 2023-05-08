package s0508;

public class Student {
	private String name="이름없음";
	private int grade=0;
	private double score;
	static int count = 0;
	static String SchoolName = "서로고";
	static final Double PI = 3.141592;

	Student() {// 생성자
		count++; // 생성할때 마다 학생수를 증가시키려는 목적
	}

	// 이름을 저장
	void setName(String n) {
		name = n;
	}

	// 이름을 리턴
	String getName() {
		return name;
	}
	void setGrage(int g) {
		grade=g;
	}
	int getGrage() {
		return grade;
	}
	void setScore(double s) {
		score=s;
	}
	double getScore() {
		return score;
	}
	void printAll() {
		System.out.println("이름 : "+getName()+"\n"+"학년 : "+getGrage()+"\n"+"점수 : "+getScore());
	}

}

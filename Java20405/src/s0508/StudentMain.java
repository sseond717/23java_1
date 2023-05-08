package s0508;

public class StudentMain {
	public static void main(String[] args) {
		Student kim = new Student();
		kim.SchoolName="서울로봇고";
		System.out.println(kim.SchoolName+" 생성된 학생 객체 수 : " + Student.count);
		Student kang = new Student();
		System.out.println(kang.SchoolName+" 생성된 학생 객체 수 : " + Student.count);
		Student park = new Student();
		System.out.println(park.SchoolName+" 생성된 학생 객체 수 : " + Student.count);
		System.out.println("생성된 학생 객체 수는 : " + Student.count+" 입니다.");
	}
}


package s0508;


public class Student {
	String name;
	static int grade,count=0;
	static String SchoolName="서로고";
	static final Double PI = 3.141592;
	Student(){
		count++; //생성할때 마다 학생수를 증가시키려는 목적
	}
}

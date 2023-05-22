package s0522;

public class Employee {
	private String name;
	private int no, age;

	Employee() {
	}

	Employee(String name, int no, int age) {
		this.name = name;
		this.no = no;
		this.age = age;
	}

	String getName() {
		return name;
	}

	int getNo() {
		return no;
	}

	int getAge() {
		return age;
	}

	void setName(String name) {
		this.name = name;
	}

	void setNo(int no) {
		this.no = no;
	}

	void setAge(int age) {
		this.age = age;
	}
	@Override //여기서 오버라이드란 나만 쓸거예요 이거임 ㅇㅋ? ㅇㅇ
	public String toString() {
		return "이름:"+name+" 번호:"+no+" 나이:"+age;
		
	}
	void print() {
		System.out.println("이름:"+name+" 번호:"+no+" 나이:"+age);
		
	}
}

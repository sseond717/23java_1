
package s0612;

public class Student {
	String name, hakbun, phone, juso, major;

	public Student() {
	}

	public Student(String name, String hakbun) {
		this.name = name;
		this.hakbun = hakbun;
	}

	public void sleep() {
		System.out.println(name + "은(는) 잔다.");
	}

	public void noise() {
		System.out.println(name + "은(는) 떠든다.");
	}

	public void eat() {
		System.out.println(name + "은(는) 먹는다.");
	}

	public void hit() {
		System.out.println(name + "은(는) 때리다.");
	}

	public void study() {
		System.out.println(name + "은(는) 공부하다.");
	}

}

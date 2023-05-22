package s0522;

public class Circle {
	private double radius;
	private final static double PI = 3.14;

	Circle() {

	}

	Circle(double radius) {

	}

	double getRadius() {
		return radius;
	}

	void setRadius(double radius) {
		this.radius = radius;

	}

	double computeArea() {
		//원의 넓이 PI * r^2
		return radius*radius*PI;
	}
	double computeperimeter() {
		return 2*PI*radius;
	}
	void print() {
		System.out.println("\n원의 반지름 "+radius);
		System.out.println("넓이 : "+computeArea()+", 둘레 : "+computeperimeter());
		System.out.println("-----------------------------");
	}
}

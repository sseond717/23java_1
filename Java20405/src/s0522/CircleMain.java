package s0522;

import java.util.Scanner;

public class CircleMain {
	public static void main(String[] args) {
		Circle c1 = new Circle();
		c1.setRadius(5);
		System.out.println("넓이 : " + c1.computeArea());
		System.out.println("둘레 : " + c1.computeperimeter());
		System.out.println();
		// 반지름이 8인 원의 둘레와 넓이를 구하시오.
		Circle c2 = new Circle();
		c2.setRadius(8);
		System.out.println("넓이 : " + c2.computeArea() + ", 둘레 : " + c2.computeperimeter());
		c2.print();

		double r;
		System.out.print("반지름 입력 : ");
		Scanner sc = new Scanner(System.in);
		r = sc.nextDouble();
		Circle c3= new Circle();
		c3.setRadius(r);
		c3.print();
	}

}

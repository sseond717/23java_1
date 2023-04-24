package s0327;

import java.util.Scanner;

public class 연산자1 {
	public static void main(String[] args) {
		//System.out.println(5.3%2.1);
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자입력 : ");
		int a;
		a= sc.nextInt();
		if(a%2==0) {
			System.out.println(a+"는 짝수 입니다");
		}else {
			System.out.println(a+"는 홀수 입니다");
		}
	}
}

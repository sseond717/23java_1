
package s0327;

import java.util.Scanner;

public class 연산자2 {
	public static void main(String[] args) {
		int a,b;char op; 
		Scanner sc= new Scanner(System.in);
		System.out.print("숫자 a입력 :");
		a=sc.nextInt();
		System.out.print("숫자 b입력 :");
		b=sc.nextInt();
		System.out.print("연산자 c입력 :");
		op=sc.next().charAt(0);
		if( op == '+' ) {
			 System.out.printf("%d+%d=%d",a,b,(a+b));
		}else if( op == '-' ) {
			 System.out.printf("%d-%d=%d",a,b,(a-b));
		}else if( op == '*' ) {
			 System.out.printf("%d*%d=%d",a,b,(a*b));
		}else if( op == '/' ) {
			 System.out.printf("%d/%d=%d",a,b,(a/b)); 
		}else {
			 System.out.println("사칙연산자가 아닙니다.");
		}
	}
}

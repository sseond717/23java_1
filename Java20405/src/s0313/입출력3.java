package s0313;

import java.util.Scanner;

public class 입출력3 {
	public static void main(String[] args) {
		int num1,num2,num3,sum;
		double avg;
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 수 입력 : ");
		num1=sc.nextInt();
		System.out.print("두 번째 수 입력 : ");
		num2=sc.nextInt();
		System.out.print("세 번째 수 입력 : ");
		num3=sc.nextInt();
		sum=num1+num2+num3;
		avg=sum/3.0;
		System.out.printf("합계 : %d 평균 : %.1f",sum,avg);
		sc.close();
	}

}

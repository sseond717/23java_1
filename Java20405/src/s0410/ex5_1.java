package s0410;

import java.util.Scanner;

public class ex5_1 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num=sc.nextInt(); int sum=0 ;
		for (int i = 1; i <=num; i++) {
			if(i%2!=0) {
				sum+=i;
				System.out.print("+"+i);
			}else {
				sum-=i;
				System.out.print("-"+i);
			}
		}System.out.print("="+sum);
	}

}

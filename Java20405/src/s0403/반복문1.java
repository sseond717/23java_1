package s0403;

import java.util.Iterator;
import java.util.Scanner;

public class 반복문1 {
	public static void main(String[] args) {
		int N, sum=0;
		System.out.print("N을 입력 : ");
		Scanner sc = new Scanner(System.in);
		N=sc.nextInt();
		for (int i = 1; i <=N; i++) {
			if (i%2==0) {
				sum-=i;
			System.out.print("-"+i);
			}else {
				sum+=i;
				System.out.print("+"+i);
			}                                                 
		}System.out.print("="+sum); 
	}
}

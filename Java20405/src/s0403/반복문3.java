package s0403;

import java.util.Scanner;

public class 반복문3 {
	public static void main(String[] args) {
		int a=1;
		System.out.print("N을 입력");
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		while(true) {
			
			if(a%3==0) {
				a++;
				continue;
			}System.out.print(a+"\t");
			if (a==N) 
				break;
			a++;
		}

	}
}


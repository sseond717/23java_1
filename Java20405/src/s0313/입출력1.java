package s0313;

import java.util.Scanner;

public class 입출력1 {
	public static void main(String[] args) {
		System.out.println("3과4를 결합 : "+3+4 );
		System.out.println("3과4를 결합 : "+(3+4) );
		System.out.println("나는 \"안녕\"하고 말했다");
		
		Scanner sc= new  Scanner(System.in);
		System.out.print("나이를 입력해주세요 : ");
		int age = sc.nextInt();
		System.out.println("내 나이는 "+age+"세");
		sc.close();
	}

}

package s0313;

import java.util.Scanner;

public class 입출력2 {
	public static void main(String[] args) {
		String major,num,name;
		Scanner sc = new Scanner(System.in);
		System.out.print("학과 : ");
		major = sc.next();
		System.out.print("학번 : ");
		num = sc.next();
		System.out.print("이름 : ");
		name = sc.next();
		System.out.println("저는 "+major+num+name+"입니다.");
		sc.close();
	}

}

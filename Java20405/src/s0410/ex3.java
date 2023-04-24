package s0410;

import java.util.Scanner;

public class ex3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("달 입력 : ");
		int month = sc.nextInt(), day;
		switch (month) {
		case 2:
			day=28;
			break;
		case 4:
		case 6:
		case 8:
		case 9:
		case 11:
			day=30;
			break;
		default:
			day=31;
			break;
		}System.out.println(month+"월은 "+day+" 일입니다.");
	}

}

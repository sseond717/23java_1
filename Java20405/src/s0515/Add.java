package s0515;

public class Add {
	// 오버로딩
	// 숫자더하기 add
	int add(int a, int b) {
		return a + b;
	}

	// 문자 더하기 add
	String add(String a, String b) {

		return a + b;
	}

	String add(String a, String b, String c) {

		return a + b + c;
	}
}
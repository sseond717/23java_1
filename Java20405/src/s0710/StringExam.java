package s0710;

public class StringExam {
	public static void main(String[] args) {
		String str = new String("abcdefghijklnmopqrstuvwxyz");
		
		System.out.println("1.문자열의 길이 : "+ str.length());
		
		System.out.println("2.세번째 문자 : "+ str.charAt(2));
		
		System.out.println("3.같은 문자 : "+ str.equals("abcd"));
		
		System.out.println("4.비어있는가 : "+ str.isEmpty());
		
		System.out.println("5.ZZZ으로 바꾸기 : " + (str = str.replace("abc", "ZZZ")));
		
		System.out.println("6.대문자로 바꾸기 : " + str.toUpperCase());
		
		System.out.println("7.중간문자 추출 : " + str.substring(4, 8));
	}
}

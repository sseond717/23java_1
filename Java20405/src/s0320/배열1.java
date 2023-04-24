package s0320;

public class 배열1 {
	public static void main(String[] args) {
		int a[]={11,22,33,44,55};
		int []b={1,2,3,4,5};
		int c[]=new int[5];
		
		boolean d[] = new boolean[5];
		System.out.println(d[0]);
		
		char e[] = new char[5];
		System.out.println(e[0]);
		System.out.println("----");
		
		System.out.println("a배열의 크기 : "+a.length);
		for (int i = 0; i < a.length; i++) {
			System.out.println("a["+i+"]"+"="+a[i]);
		}
		
		String str[]=new String[3];
		str[0]="Hello";
		str[1]="Java";
		str[2]="World";
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
	}
}




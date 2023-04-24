package s0320;

public class 변수2 {
	public static void main(String[] args) {
		int a = 127;
		byte b=(byte)a;
		System.out.println(b);
		
		//스트링풀
		String s1 ="java!";
		String s2 ="java";
		if(s1==s2) {
			System.out.println("같은주소");
		}else {
			System.out.println("다른주소");
		}
		
		String s3= new String("java");
		String s4=new String("java");
		if (s3==s4) {
			System.out.println(s3+"같은주소");
		}else {
			System.out.println(s3+"다른주소");
		}
		
		
	}
}

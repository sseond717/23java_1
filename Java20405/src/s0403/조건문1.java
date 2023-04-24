package s0403;

public class 조건문1 {
	public static void main(String[] args) {
		 int a=10;
		 if(a!=0) {
			 System.out.println(a+"는 0이 아니다.");
		 }else {
			 System.out.println(a+"는 0이다");
		 }
		 
		 
		 
		 int b=10;
		 char op = '*';
		 switch (op) {
		case '+':
			System.out.println(a+"+"+b+"="+(a+b));
			break;
		case '-':
			System.out.println(a+"-"+b+"="+(a-b));
			break;
		case '*':
			System.out.println(a+"*"+b+"="+(a*b));
			break;
		case '/':
			System.out.println(a+"/"+b+"="+(a/b));
			break;

		default:
			break;
		}
	}

}

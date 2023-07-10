package s0710;

public class integerMian {
	public static void main(String[] args) {
		Integer x, y;
		x = 25678;
		y = 1000;
		
		int z;
		
		System.out.println(x.compareTo(y));
		
		System.out.println(Integer.decode("1234"));
		System.out.println(Integer.valueOf("1234"));
		
		System.out.println(z = x.intValue());
		
		System.out.println(Integer.min(x, y));
		
		System.out.println(Integer.reverse(x));
		
		System.out.println(x.toString() + y.toString());
		
		double a = -3.5;
		System.out.println(Math.abs(a));
		
		System.out.println(Math.round(a));
		
		System.out.println(Math.pow(a, 3));
		
		double b = 9;
		System.out.println(Math.sqrt(b));
		
		System.out.println((int)(Math.random()*100));
	}
}

package s0403;

public class 반복문2 {
	public static void main(String[] args) {
		for (int i = 1; i <=3; i++) {
			for (int j = 7; j <=9; j++) {
				System.out.print(j+"\t"); 
			}System.out.print("\n");
		}
		
		
		System.out.println("-------예제29-------");
		for (int i = 1; i <=3 ; i++) {
			for (int j = 3; j>=i; j--) {
				System.out.print("*"+"\t"); 
			}System.out.print("\n");
		}             
		
	}
                                                 
}

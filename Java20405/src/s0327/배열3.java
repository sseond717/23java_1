package s0327;

public class 배열3 {
	public static void main(String[] args) {
		//int[][]a= new int[2][3];
		//a[0][0]=1;a[0][1]=2;a[0][2]=3; 
		//a[1][0]=10; a[1][1]=10;a[1][2]=30;
		//for (int i = 0; i < a.length; i++) {
			//for (int j = 0; j < a[i].length; j++) {
				//System.out.print(a[i][j]+"\t");
			//}
		//}
		int a[][]= new int[][] {{1,2,3},{10,20,30}};
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.printf("%d행 %d열 %d\n ",i,j,a[i][j]);
			}
		}
		 
	}
}

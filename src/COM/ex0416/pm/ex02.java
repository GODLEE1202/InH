package COM.ex0416.pm;

public class ex02 {

	public static void main(String[] args) {
		
		int[][] a = {{1,2,3},{4,5,6},{7,8,9}};
		//method1(a);
		method2(a[0]);
	}
	public static void method1(int[][] a) {
		for(int i = 0; i<3; i++)
		{
			for (int j = 0; j < 3; j++) {
				System.out.println(a[i][j]);
			}
		}
	}
	public static void method2(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

}

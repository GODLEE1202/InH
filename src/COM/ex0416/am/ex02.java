package COM.ex0416.am;

public class ex02 {

	/*
	 * 인자의 수를 모를경우 
	 * 만약 인자의 갯수가 불투명할 경우 배열타입으로 선언했었다.
	 * 하지만 배열 타입으로 선언하게 될 경우 메서드를 호출하기 전 배열을 생성해야 하고 초기화 해야하는 불편함이 감수되었다.
	 * 메서드의 인자를 "..."을 사용하여 선언하면 메서드 호출 시 넘겨준 값의 수에 따라 자동으로 배열이 생성되고 매개값으로 사용된다.
	 * 메서드 안에서는 해당 인자에 접근하기 위해 마치 배열처럼 접근하도록 인덱스를 제공한다.
	 */
	public static void main(String[] args) {
		//method1(1,2);
		int[] arr = {1,2,3,4,5,6};
		method2(arr);
		method3(1,2,3,4,5,6,7,89,90,100,3,90);
		method4(1,"String",0.123,1,2,3,4,5,2,6,2,7,8,989,9,2);
	}
	public static void method1(int i , int j) {
		System.out.println(i+j);
	}
	public static void method2(int[] i) {
		int sum = 0;
		for(int j :i) { //int[] i배열 값을 처음부터 끝까지 j 변수에 넣는다.
			//System.out.println(j);
			sum += j;
			System.out.println(sum);
		}
	}
	public static void method3(int ...i) {		//무한 변수인자 ...i
		int sum = 0;
		for(int j : i) {
			sum+=j;
		}
		
		System.out.println(sum);
	}
	public static void method4(int i,String s, double d,int ...j) { 	//무한변수인자 넣기전 인자값을 무조건 넣어야한다.생략불가
		
	}

}

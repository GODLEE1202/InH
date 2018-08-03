package COM.ex0424.am;

public class Ex07 {

	public static void main(String[] args) {
		
		Interface5 fi;
		
		fi = (a , b)->{
			int result = a+b;
			return result;
		};
		System.out.println(fi.method(2, 5));
		
		fi = ( a , b )->{return a+b;}; 
		System.out.println(fi.method(2, 5));
		
		fi = (a,b) -> a+b;
		System.out.println(fi.method(2, 5));
		
		
		fi = (a,b) -> sum(a,b);
		System.out.println(fi.method(1, 2));
		
	}
	
	public static int sum(int a, int b) {
		return a+b;
		
	}

}

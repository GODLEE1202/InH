package COM.ex0424.am;

public class Ex06 {
	public static void main(String[] args) {
		Interface4 fi;
		
		fi = (x) ->{	
			int result = x*5;
			System.out.println(result);
		};
		fi.method(2);
		
		fi = (x) -> {System.out.println(x*5);};
		fi.method(2);
		
		fi = x -> System.out.println(x*5);
		fi.method(3);
		
		Interface4 f2;
		
		f2 = x -> System.out.println(x*7);
		f2.method(3);
	
	
	
	
	}

}

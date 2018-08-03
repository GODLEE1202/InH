package COM.ex0424.am;

public class Ex05 {
	
	public static void main(String[] args) {
		Interface3 fi;
		
		fi = () ->{
			String str = "method call1";
			System.out.println(str);
		};
		fi.method();
		
		
		fi = ()-> {System.out.println("method call2");};
		fi.method();
		
		
		
		fi = () ->System.out.println("method call3");
		fi.method();
	
	
	
	}

}

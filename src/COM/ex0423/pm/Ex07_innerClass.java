package COM.ex0423.pm;

public class Ex07_innerClass {
	class InstanceClass{
		int i = 1;
		
		public InstanceClass() {
			
		}
		public void method1() {
			
		}
		//public static int i2;
		//public static void method2() {}
		//static 사용 불가	
	}

	
	
	public static class StaticClass{
	public staticClass() {}
	public int i1;
	public static int i2;
	public void method1() {}
	public static void method2() {}
	
	}
	
	public void method1() {
		class LocalClass{
			public LocalClass() {}
			int i1;
			void method1() {}
			//static int i2;
			//static void method2() {}
			//static 사용 불가
		}
	}

	public static void main(String[] args) {
		Ex07_innerClass ex07 = new Ex07_innerClass();
		 Ex07_innerClass ic = ex07.new InstanceClass;
		 
		 
		 
		 
		 ic.i1 =1;
		 ic.method1();
		 ex07.static
	}

	

}

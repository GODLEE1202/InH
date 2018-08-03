package COM.ex0419.pm;

public class Ex02_static {
	/*
	 * static
	 * 클래스 영역에 선언되는 메서드 혹은 맴버변수를 선언할 떄 쓰임
	 * static필드/메서드는 모든 인스턴스에서 공유한다.
	 * static필드/메서드는 인스턴스 선언 없이 접근이 가능하다.
	 * static 필드 / 메서드는 상태가 프로그램 끝나기 전까지 유지가 된다.
	 * static 영역의 매개변수와 메서드, 필드는 계속 JVM 메모리 상에 상주하게 된다.
	 * 이러한 static이 메모상에 계속 상주할 경우 메모리의 비중이 상당히 커져 시스템의 부하를 많이 잡아먹게 된다.
	 * 이후 시스템에 치명적인 손상을 입힐 수 있으므로 static은 공용상수 혹은 공용메서드에서만 사용한다.
	 * 
	 */
	
	
	int a = 1;
	static int b = 2;
	
	public static void main(String[] args) {
		Ex02_static ex02_static = new Ex02_static();
		ex02_static.a = 1;
		ex02_static.b = 3;
		
		System.out.println(b);
		System.out.println(ex02_static.b);
		ex02_static.b++;
		Ex02_static ex02_1 = new Ex02_static();
		System.out.println(ex02_1.b);
		
		method1();
		ex02_static.method1();
	}
	public static void method1() {
		System.out.println("스테틱 메서드 입니다");
	}
}

package COM.ex0425.pm;

public class Ex06 {
	//예외 강제 던지기
	public static void main(String[] args) {
		//int a = 2;
		int a =3;
		try {
			System.out.println("로직 1줄");
			System.out.println("로직 2줄");
			
			CustomException e = new CustomException();
			
			if(a>2) {
				throw e;
			}
			
			System.out.println("로직 3줄");
			System.out.println("로직 4줄");
			System.out.println("로직 5줄");
		}catch(Exception e){
			System.out.println("커스텀익셉션 로직");
		}
	}
}

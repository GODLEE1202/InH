package COM.ex0427.pm;

import java.io.IOException;
import java.io.InputStream;

public class Ex04 {
	//표준입출력
	/*
	 * 콘솔 화면을 통한 데이터의 입출력을 표준 입출력이라고 한다.
	 * JVM이 시작되면서 자동적으로 생성되는 스트림
	 * System.in :콘솔로부터 데이터를 입력받는데 사용
	 * System.out:콘솔로부터 데이터를 출력받는데 사용
	 * System.err:콘솔로 데이터를 출력하는데 사용(에러 전용)
	 * 
	 */
	public static void main(String[] args) throws IOException {
		System.out.println("-=-메뉴=-=");
		System.out.println("1. 예금 조회");
		System.out.println("2. 예금 출금");
		System.out.println("3. 예금 입금");
		System.out.println("4. 예금 송금");
		System.out.println("5. 종료");
		
		System.out.println("메뉴를 선택하세요");
		
		InputStream in = System.in;
		//System.out.println(in.read());
		
		char c = (char)in.read();
		
		int i = Integer.parseInt(c+"");
		System.out.println(i+3);
		
		switch (c) {
		case '1':
			System.out.println("1. 예금 조회");
			break;
		case '2':
			System.out.println("2. 예금 출금");			
			break;
		case '3':
			System.out.println("3. 예금 입금");	
			break;
		case '4':
			System.out.println("4. 예금 송금");	
			break;		
		case '5':
			System.out.println("5. 종료");	
			break;
		
		default:
			System.out.println("종료");
			break;
		}
		
	
	}
}

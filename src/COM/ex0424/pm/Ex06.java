package COM.ex0424.pm;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
	
		/*
		 * Bean객체 
		 * 데이터를 담거나 담은 데이터를 리턴하는 용도로만 쓰이는 객체
		 * 데이터 묶음의 이동이 목적으로 웹이나 다른 어플리케이션에서 자주 사용되는 객체이다.
		 * 사용예) 게시판, 회원정보 등
		 * Bean객체는 private로 접근제한자가 되어있는 필드와 getter setter 메서드 들로 구성되어있다. (알트+쉬프트+S)
		 * 데이터를 담거나 데이터를 리턴할 때 데이터의 무결성이 위배가 된다 판단될 경우
		 * 중간에 필터 혹은 검사를 하는 로직을 작성하여 데이터의 안정성을 높일 수 있다.
		 */
		
		
		
/*		Bean bean = new Bean();
		bean.address = "서울시 구로구";
		bean.name = "홍길동";
		//멤버변수에 직접 접근할시 보안상 좋지 않음
*/	
		Scanner scan = new Scanner(System.in);
		Bean bean = new Bean();
		bean.setAddress("서울시 구로구");
		bean.setAddress(scan.nextLine());
		bean.setName("홍길동");
		System.out.println(bean.getAddress());
	
	}

}

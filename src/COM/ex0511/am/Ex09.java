package COM.ex0511.am;

import javafx.application.Application;
import javafx.stage.Stage;

public class Ex09 extends Application{

	public Ex09() {
		System.out.println(Thread.currentThread().getName() + " : this() 호출");
	}
	
	//init() :메인 클래스의 실행 매개값을 얻어 애플리케이션이 이용할 수 있게 해준다.
	@Override
	public void init() throws Exception {
		System.out.println(Thread.currentThread().getName() + " : init() 호출");
		
	}
	//Start() : init매서드가  끝나고 실행이 된다.
//				init과 생성자에서 설정한 내용을 바탕으로 사용자에게 GUI환경의 프로그램을 제공한다.
	@Override
	public void start(Stage arg0) throws Exception {
		System.out.println(Thread.currentThread().getName() + " : start() 호출");
		arg0.show();
	}
	
	//Stop() :	어플리케이션이 종료되기 전에 자원을 정리할 기회를 주는 메서드
	@Override
	public void stop() throws Exception {
		System.out.println(Thread.currentThread().getName() + " : stop() 호출");
		
	}
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName() + " : main() 호출");
		launch(args);
	}

}

package COM.ex0511.am;

import javafx.application.Application;
import javafx.stage.Stage;

public class Ex09 extends Application{

	public Ex09() {
		System.out.println(Thread.currentThread().getName() + " : this() ȣ��");
	}
	
	//init() :���� Ŭ������ ���� �Ű����� ��� ���ø����̼��� �̿��� �� �ְ� ���ش�.
	@Override
	public void init() throws Exception {
		System.out.println(Thread.currentThread().getName() + " : init() ȣ��");
		
	}
	//Start() : init�ż��尡  ������ ������ �ȴ�.
//				init�� �����ڿ��� ������ ������ �������� ����ڿ��� GUIȯ���� ���α׷��� �����Ѵ�.
	@Override
	public void start(Stage arg0) throws Exception {
		System.out.println(Thread.currentThread().getName() + " : start() ȣ��");
		arg0.show();
	}
	
	//Stop() :	���ø����̼��� ����Ǳ� ���� �ڿ��� ������ ��ȸ�� �ִ� �޼���
	@Override
	public void stop() throws Exception {
		System.out.println(Thread.currentThread().getName() + " : stop() ȣ��");
		
	}
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName() + " : main() ȣ��");
		launch(args);
	}

}

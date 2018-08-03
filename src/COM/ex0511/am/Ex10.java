package COM.ex0511.am;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Ex10 extends Application{

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage arg0) throws Exception {
		
		//레이아웃 창 생성
		VBox root = new VBox();//VBOX LAYOUT 생성
		root.setPrefWidth(350); //VBOX의 폭을 설정
		root.setPrefHeight(150);//VBox의 높이 설정
		root.setAlignment(Pos.CENTER);//모든 컨트롤을 중앙으로 정렬
		root.setSpacing(20);
		
		//라벨 컨트롤 생성
		Label label = new Label(); //라벨 생성
		label.setText("Hello, JavaFX"); //글자를 작성
		label.setFont(new Font(50)); //글자 크기를 50으로 작성
		
		//버튼 생성
		Button button = new Button(); //버튼 컨트롤 생성
		button.setText("확인"); //버튼 내의 TEXT 작성
		button.setOnAction(e -> Platform.exit() ); //클릭시 이벤트 처리
		
		//VBOX 창에 컨트롤 삽입
		root.getChildren().add(label); //VBOX에 라벨을 삽입
		root.getChildren().add(button); //VBOX에 버튼을 삽입
		
		//Scene 생성
		Scene scene = new Scene(root);
		
		arg0.setTitle("AppMain");
		arg0.setScene(scene);
		arg0.show();	//Stage를 보여주는 메서드
		
		
	}
	

}

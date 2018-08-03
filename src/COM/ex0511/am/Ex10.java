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
		
		//���̾ƿ� â ����
		VBox root = new VBox();//VBOX LAYOUT ����
		root.setPrefWidth(350); //VBOX�� ���� ����
		root.setPrefHeight(150);//VBox�� ���� ����
		root.setAlignment(Pos.CENTER);//��� ��Ʈ���� �߾����� ����
		root.setSpacing(20);
		
		//�� ��Ʈ�� ����
		Label label = new Label(); //�� ����
		label.setText("Hello, JavaFX"); //���ڸ� �ۼ�
		label.setFont(new Font(50)); //���� ũ�⸦ 50���� �ۼ�
		
		//��ư ����
		Button button = new Button(); //��ư ��Ʈ�� ����
		button.setText("Ȯ��"); //��ư ���� TEXT �ۼ�
		button.setOnAction(e -> Platform.exit() ); //Ŭ���� �̺�Ʈ ó��
		
		//VBOX â�� ��Ʈ�� ����
		root.getChildren().add(label); //VBOX�� ���� ����
		root.getChildren().add(button); //VBOX�� ��ư�� ����
		
		//Scene ����
		Scene scene = new Scene(root);
		
		arg0.setTitle("AppMain");
		arg0.setScene(scene);
		arg0.show();	//Stage�� �����ִ� �޼���
		
		
	}
	

}

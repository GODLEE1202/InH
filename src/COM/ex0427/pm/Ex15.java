package COM.ex0427.pm;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Ex15 {
	public static void main(String[] args) {
	
		Path path = Paths.get("C:\\Users\\IH\\eclipse-workspace\\file\\ggg.txt");
		System.out.println("[���ϸ�] :"+path.getNameCount());
		System.out.println("�θ���͸� �� : "+ path.getParent());
		System.out.println("��ø ��μ� : " + path.getNameCount());
		
		
		
		
		
		
		
		
	}
}

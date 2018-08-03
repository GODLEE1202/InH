package COM.ex0427.pm;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Ex15 {
	public static void main(String[] args) {
	
		Path path = Paths.get("C:\\Users\\IH\\eclipse-workspace\\file\\ggg.txt");
		System.out.println("[파일명] :"+path.getNameCount());
		System.out.println("부모디렉터리 명 : "+ path.getParent());
		System.out.println("중첩 경로수 : " + path.getNameCount());
		
		
		
		
		
		
		
		
	}
}

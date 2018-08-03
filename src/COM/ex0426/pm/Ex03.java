package COM.ex0426.pm;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class Ex03 {
	public static void main(String[] args) {
		List<Student> list = Arrays.asList(new Student("È«±æµ¿", 90), new Student("±è¿¬¾Æ", 97));
		
		//±¸Çü ·ÎÁ÷///////////////////////////////////////////////////////////////////
//		Iterator<Stutdent> it = list.iterator();
//		while (it.hasNext()) {
//			Stutdent st = it.next();
//			System.out.println(st.getName() + "---"+ st.getScore());
		///////////////////////////////////////////////////////////////////////////
			
		Stream<Student> stream = list.stream();
		
		stream.forEach(s -> {
		
			System.out.println(s.getName() + "-"+ s.getScore());
			});
			
		}
}


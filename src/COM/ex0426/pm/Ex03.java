package COM.ex0426.pm;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class Ex03 {
	public static void main(String[] args) {
		List<Student> list = Arrays.asList(new Student("ȫ�浿", 90), new Student("�迬��", 97));
		
		//���� ����///////////////////////////////////////////////////////////////////
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


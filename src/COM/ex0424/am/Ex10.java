package COM.ex0424.am;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class Ex10 {
	
	private static List<Student> list = new ArrayList<Student>();
	
	static{
		list.add(new Student("홍길동",90, 85));
		list.add(new Student("황진이", 95, 90));
		
	}
							//메소드(람다식 타입 <인자타입, return타입> 변수이름)
	public static void printString(Function<Student, String> func) {
		for(Student stu : list) {
		System.out.print(func.apply(stu)+" ");	
		
		}
	System.out.println();
	}
	
	public static void printInt(ToIntFunction<Student> func) {
		for(Student stu : list) {
			System.out.print(func.applyAsInt(stu)+"asdasdasdasdasd");
			
		}
		System.out.println();
	}
	
	public static double avg(ToIntFunction<Student> func) {
		int sum = 0;
		for (int i = 0; i < list.size(); i++) {
			sum += func.applyAsInt(list.get(i));
		}
		double avg = (double) sum / list.size();
		return avg;
	}
	
	
	public static void main(String[] args) {
		System.out.println("[학생이름]");
		printString(t->t.getName());
	
		System.out.println("[영어점수]");
		printInt(t ->t.getEng());
		
		System.out.println("[수학점수]");
		printInt(t->t.getMath());
		
		System.out.println("[영어평균점수]");
		System.out.println(avg(v->v.getEng()));
		
		System.out.println("[수학평균점수]");
		System.out.println(avg(v->v.getMath()));
	
	}
	
}

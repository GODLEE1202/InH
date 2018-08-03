package COM.ex0424.pm;


import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Ex02 {

	private static List<Student> list = Arrays.asList(new Student("ȫ�浿","����",70),
			new Student("ȫ�浿","����",70),
			new Student("�Ż��Ӵ�","����",90),
			new Student("���","����",69),
			new Student("������","����",87)
			);
	
	public static double avg(Predicate<Student> pred)
	{
		int count = 0;
		int sum = 0;
		for(Student stu :list) {
			if(pred.test(stu)) {
				count++;
				sum+=stu.getScore();
			}
		}
		return (double) sum/count;
	}
	
	
	public static void main(String[] args) {
		double maleAvg = avg(t->t.getGender().equals("����"));
		System.out.println("������� : "+maleAvg);
		double femaleAvg = avg(t->t.getGender().equals("����"));
		System.out.println("������� : "+femaleAvg);
		
	}

}

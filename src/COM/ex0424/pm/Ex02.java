package COM.ex0424.pm;


import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Ex02 {

	private static List<Student> list = Arrays.asList(new Student("홍길동","남자",70),
			new Student("홍길동","남자",70),
			new Student("신사임당","여자",90),
			new Student("김삿갓","남자",69),
			new Student("유관순","여자",87)
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
		double maleAvg = avg(t->t.getGender().equals("남자"));
		System.out.println("남자평균 : "+maleAvg);
		double femaleAvg = avg(t->t.getGender().equals("여자"));
		System.out.println("여자평균 : "+femaleAvg);
		
	}

}

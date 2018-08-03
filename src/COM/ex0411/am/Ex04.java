package COM.ex0411.am;

import java.util.Random;

public class Ex04 {

	public static void main(String[] args) {
		//첫번쨰 방법
		System.out.println((int)(Math.random()*10)+1);
		
		//두번째 방법
		Random random = new Random();
		System.out.println(random.nextInt(10));
		
		System.out.println(random.nextDouble());
		
		System.out.println(random.nextBoolean());
		
		
	
	
	}

}

package COM.ex0411.am;

import java.util.Random;

public class Ex04 {

	public static void main(String[] args) {
		//ù���� ���
		System.out.println((int)(Math.random()*10)+1);
		
		//�ι�° ���
		Random random = new Random();
		System.out.println(random.nextInt(10));
		
		System.out.println(random.nextDouble());
		
		System.out.println(random.nextBoolean());
		
		
	
	
	}

}

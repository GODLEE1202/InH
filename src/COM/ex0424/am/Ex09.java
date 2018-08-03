package COM.ex0424.am;

import java.util.function.IntSupplier;

public class Ex09 {
	public static void main(String[] args) {
		IntSupplier ins = () -> (int)(Math.random()*6)+1;	
		
		System.out.println("´«ÀÇ ¼ö :"+ ins.getAsInt());
	}
}

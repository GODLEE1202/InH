package COM.ex0423.pm;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Ex01lotto {
	public static void main(String[] args) {
		//Set<Integer> set =  new HashSet<Integer>();
		Set<Integer> set =  new TreeSet<Integer>();
		Set<Integer> set1 = new TreeSet<Integer>();
		Set<Integer> set2 =  new TreeSet<Integer>();
		Set<Integer> set3 = new TreeSet<Integer>();
		Set<Integer> set4 =  new TreeSet<Integer>();
		Set<Integer> set5 = new TreeSet<Integer>();
		Set<Integer> set6 =  new TreeSet<Integer>();
		Set<Integer> set7 = new TreeSet<Integer>();
		Set<Integer> set8 =  new TreeSet<Integer>();
		Set<Integer> set9 = new TreeSet<Integer>();
		
		while(set.size()<6) {
	
			set.add((int)(Math.random()*45)+1);
		}
		while(set1.size()<6) {
			
			set1.add((int)(Math.random()*45)+1);
		}
		while(set2.size()<6) {
			
			set2.add((int)(Math.random()*45)+1);
		}
		while(set3.size()<6) {
			
			set3.add((int)(Math.random()*45)+1);
		}
		while(set4.size()<6) {
			
			set4.add((int)(Math.random()*45)+1);
		}
		while(set5.size()<6) {
			
			set5.add((int)(Math.random()*45)+1);
		}
		while(set6.size()<6) {
			
			set6.add((int)(Math.random()*45)+1);
		}
		while(set7.size()<6) {
			
			set7.add((int)(Math.random()*45)+1);
		}

		while(set8.size()<6) {
			
			set8.add((int)(Math.random()*45)+1);
		}

		while(set9.size()<6) {
			
			set9.add((int)(Math.random()*45)+1);
		}

		
		System.out.println(set);
		System.out.println(set1);
		System.out.println(set2);
		System.out.println(set3);
		System.out.println(set4);
		System.out.println(set5);
		System.out.println(set6);
		System.out.println(set7);
		System.out.println(set8);
		System.out.println(set9);
		
	}
}

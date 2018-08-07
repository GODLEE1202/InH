package coding;

public class tttttt {

	public static void main(String[] args) {
		
//		int firstNum = (int)(257 / Math.pow(10, (int)(Math.log10(257))));
//		int rNum = (int)(257 % Math.pow(10, (int)(Math.log10(257))));
//		int secondNum = (int)(rNum / Math.pow(10, (int)(Math.log10(rNum))));
//		int srNum = (int)(rNum % Math.pow(10, (int)(Math.log10(rNum))));
		
		//System.out.println((int)(Math.pow(10, (int)(Math.log10(257)))));
		//System.out.println((int)(Math.log10(257)));
		
		/*System.out.println(firstNum);
		System.out.println(rNum);
		System.out.println(secondNum);
		System.out.println(srNum);
		System.out.println((int)(Math.pow(10, 0)));
		System.out.println("----------------------------------");
		int n = 158;
		int i = (int)(Math.log10(n));
		int[] indexNum;
		for (int j = i; j >= 0; j--) { //j는 자리수
			
			//int firstN = (int)(n / Math.pow(10, j));	//입력값의 첫째자리수
			//System.out.println(j+"번쨰자리수 :"+ firstN);
			
			int rN = (int)(n % Math.pow(10, j));	//입력값의 첫째자리 수를 뺸 나머지
			
			System.out.println(j+"번째 나머지 : " +rN);
			
			//int secondN =  (int)(rN / Math.pow(10, j));
			//System.out.println("나머지의 자리수"+ secondN);
			
		}*/
		int n = 1567;	//입력값
		int gn = (int)(Math.log10(n));// 자리수 변수 = 3
		System.out.println(gn);
		
		int[] r = new int[gn+1];
		int[] j = new int[gn+1];
		
		r[gn] = new tttttt().result(n);//값  r[3] = 1
		j[gn] = new tttttt().remaind(n);//나머지 j[3] = 567
		
		for (int i = gn; i > 0; i--) { //3번 돌리면서 [2][1][0]의 값 넣기
			r[i-1] =  new tttttt().result(j[i]); // 값
			j[i-1] = new tttttt().remaind(j[i]); //나머지
			
			System.out.println(i+"번째 배열" + r[i] +" : "+  j[i]);
			System.out.println(i);
		}
		System.out.println(r[3]);
		System.out.println(r[2]);
		System.out.println(r[1]);
		System.out.println(r[0]);
	}
	public int remaind(int rm) {
		return (int)(rm % (int)(Math.pow(10, (int)(Math.log10(rm)))));
		
	}
	public int result(int rs) {
		
		return (int)(rs / (int)(Math.pow(10, (int)(Math.log10(rs)))));
	}
	
}

package COM.ex0411.pm;

public class Ex01 {

	public static void main(String[] args) {
		int a= 0;
		{
			int b = 1;
			{
				int c = 2;
				System.out.println(a);
				System.out.println(b);
				System.out.println(c);
			}
			System.out.println(a);
			System.out.println(b);
			//System.out.println(c);
		}
		System.out.println(a);
		//System.out.println(b);
		//System.out.println(c);
	}

}

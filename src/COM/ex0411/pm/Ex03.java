package COM.ex0411.pm;

public class Ex03 {

	public static void main(String[] args) {
		
	Loop1:for(int z = 0; z < args.length; z++)
	{
		for(int i=1; i<=9; i++) {
			for(int j = 2; j<9; j++)
			{
				System.out.println((j+" * "+ i +"=" + (j*i) ));
			}
		System.out.println();
		}
	}
}
}

package COM.ex0417.pm;

public class ex02 {
	public static void main(String[] args) {
		clock ck1 = new clock();
		clock ck2 = new clock();
		
		ck1.shape = "�׸𳭸��";
		System.out.println(ck2.shape);
		
		clock ck3 = ck2;
		ck2.band = "����";
		System.out.println(ck2.band);
		System.out.println(ck3.band);
		ck3 = ck1;
		System.out.println(ck3.band);
		ck2 = ck1;
		System.out.println(ck2.band);
	}
}

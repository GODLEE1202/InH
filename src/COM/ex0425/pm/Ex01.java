package COM.ex0425.pm;

public class Ex01 {
	public static void main(String[] args) {
		AddressBook ab = new AddressBook();
		/*
		 * static 때문에 main문에 넣기 싫다
		 * while(true) {
			ab.mainProcess();	
		}
		*/
		ab.mainProcess();
		
	}
}

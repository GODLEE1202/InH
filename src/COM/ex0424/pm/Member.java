package COM.ex0424.pm;

public class Member {
	private String name;
	private String id;
	
	public method() {
		System.out.println("Member() ����");
	}
	public Member(String id) {
		System.out.println("Member(String)  ����");
		this.id = id;
		
	}
	public Member(String name, String id) {
		System.out.println("Member(String name, String id)  ����");
		this.name = name;
		
		this.id = id;
		
	}
	public String getName() {
		return name;
	}
	public String getId() {
		return id;
	}
	
	
	
	
}

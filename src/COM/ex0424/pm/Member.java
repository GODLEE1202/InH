package COM.ex0424.pm;

public class Member {
	private String name;
	private String id;
	
	public method() {
		System.out.println("Member() 실행");
	}
	public Member(String id) {
		System.out.println("Member(String)  실행");
		this.id = id;
		
	}
	public Member(String name, String id) {
		System.out.println("Member(String name, String id)  실행");
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

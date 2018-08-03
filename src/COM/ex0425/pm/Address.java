package COM.ex0425.pm;

public class Address {
	private String name;
	private String phoneNum;
	private String address;
	private String email;
	private int age;
	
	public Address(){}
	
	public Address(String name, String phoneNum, String address, String email, int age) {
		super();
		this.name = name;
		this.phoneNum = phoneNum;
		this.address = address;
		this.email = email;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "이름 = " + name + ", 번호 = " + phoneNum + ", 주소 = " + address +
				", email = " + email + ", 나이 = " + age;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}

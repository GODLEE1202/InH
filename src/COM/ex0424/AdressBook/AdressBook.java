package COM.ex0424.AdressBook;

public class AdressBook {
	private String name;
	private String phoneNum;
	private String address;
	private String email;
	
	
	@Override
	public String toString() {
		return "[�̸� =" + name + ", �ڵ��� ��ȣ =" + phoneNum + ", �ּ� =" + address + ", �̸���=" + email+ "]";
		//return "�ּҷ� [�̸�=" + name + ", �ּ�=" + address + ", �̸���=" + email+ "]";
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
	
	
}

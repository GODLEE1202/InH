package COM.ex0423.pm;

public enum Type2 {
	WALKING("��ŷȭ"), RUNNING("����ȭ"), TRACKING("Ʈ��ŷȭ"), HIKING("����ŷȭ");
	final private String name;
	
	private Type2(String name) {
		this.name = name;
		
	}
	public String getName() {
		return name;
	}
	
}

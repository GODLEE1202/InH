package COM.ex0423.pm;

public enum Type2 {
	WALKING("워킹화"), RUNNING("러닝화"), TRACKING("트래킹화"), HIKING("하이킹화");
	final private String name;
	
	private Type2(String name) {
		this.name = name;
		
	}
	public String getName() {
		return name;
	}
	
}

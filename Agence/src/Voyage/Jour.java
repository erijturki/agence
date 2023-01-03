package Voyage;

public class Jour {
	private int i;
	private String description;
	
	public Jour(int i, String description) {
		super();
		this.i = i;
		this.description = description;
	}
	
	public Jour() {
		super();
	}

	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}

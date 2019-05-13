package textAdventure;

public class Person {

	private String name;

	private String lName;
	
	private int selfesteem;

	public Person() {
		this.name="No Name";
		this.lName="Freshie";
		this.selfesteem = 10;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}
	
	public int getEsteem() {
		return selfesteem;
	}
	
	public void setEsteem(int esteem) {
		this.selfesteem = esteem;
	}

	public String toString(){
		return ("Welcome "+ this.name + "your first day of class"+ this.lName);
	}
	
}

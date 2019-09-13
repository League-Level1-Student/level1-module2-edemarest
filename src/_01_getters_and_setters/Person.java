package _01_getters_and_setters;

public class Person {
	
	private String name;
	private String superpower;
	
	Person(String name, String superpower) {
		this.name = name;
		this.superpower = superpower;
	}
	
	public String getName() {
		return name;
	}
	
	public String getPower() {
		return superpower;
	}
	
	public void setName() {
		this.name = name;
	}
	
	public void setPower() {
		this.superpower = superpower;
	}
	
	public String toString() {
		return name + " has mad " + superpower + " powers!";
	}
	
	
}

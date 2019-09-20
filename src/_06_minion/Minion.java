package _06_minion;

public class Minion {
	
	//Variables
	private String name; 
	private int eyes; 
	private String color; 
	private String master;
		
	//Constructor
	Minion(String name, int eyes, String color, String master) {
		this.name = name;
		this.color = color;
		this.eyes = eyes;
		this.master = master;
	}
	
	//Getters
	public int getEyes() {
		return eyes;
	}
	public String getName() {
		return name;
	}
	public String getColor() {
		return color;
	}
	public String getMaster() {
		return master;
	}
	
	//Setters
	public void setMaster(String master) {
		this.master = master;
		}
	public void setEyes() {
		this.eyes = eyes;
		}
	public void setColor() {
		this.color = color;
		}
	public void setName() {
		this.name = name;
		}
	
	public String toString() {
		return "Minion " + name + " has " + eyes + ", is " + color + "and belongs to " + master;
	}
	
	
	
	
}

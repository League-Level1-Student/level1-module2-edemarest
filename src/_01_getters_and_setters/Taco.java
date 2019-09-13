package _01_getters_and_setters;

public class Taco {
	private String meatType;
	private String salsaType;
	
	Taco(String meatType, String salsaType) {
		this.meatType = meatType;
		this.salsaType = salsaType;
	}
	public String getMeat() {
		return meatType;
	}
	public String getSauce() {
		return salsaType;
	}
	
	public void setMeat() {
		this.meatType = meatType;
	}
	
	public void setSauce() {
		this.salsaType = salsaType;
	}
	
	
	
	
	
	
	
	
}

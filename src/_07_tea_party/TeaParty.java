package _07_tea_party;

public class TeaParty {
	
	private String name;
	private boolean isWoman;
	private boolean isKnighted;
	
	//Getters
	public String getName() {
		return name;
	}
	public boolean getWoman() {
		return isWoman;
	}
	public boolean getKnighted() {
		return isKnighted;
	}
	
	//Setters

	
	//Welcome method
	public String welcome(String name, boolean isWoman, boolean isKnighted) {
        if (isKnighted) {
        	if(isWoman) {
        		return "Hello Lady " + name;
        	}
        	else {
        	return "Hello Sir " + name;
        	}
        }
        
        else {
        	if(isWoman) {
        		return "Hello Ms. " + name;
        	}
        	else {
        		return "Hello Mr. " + name;
        	}
        }
        
    
	}
}

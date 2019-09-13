package _04_tea_maker;

public class Runner {
public static void main(String[] args) {
	
	TeaBag teabag = new TeaBag("Mint");
	Kettle kettle = new Kettle();
	kettle.boil();
	Cup cup = new Cup();
	cup.makeTea(teabag, kettle.getWater());
	
}
}

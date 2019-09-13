package _02_sea_creature;

public class Runner {
	public static void main(String[] args) {
		
		SeaCreature bob = new SeaCreature("Spongebob");
		SeaCreature squid = new SeaCreature("Squidward");
		SeaCreature pat = new SeaCreature("Patrick");
		System.out.println(pat.getName());
		System.out.println(squid.getName());
		bob.eat();
		bob.laugh();
		squid.eat();
		pat.eat();
		squid.laugh();
		pat.laugh();
		
		
	}
}

package strategyPattern;

public class SPDemo {

	public static void main(String[] args) {

		SuperHero h = new SuperHero();
		
		h.setHero(new Hulk());
		h.showPower();
		h.setHero(new IronMan());
		h.showPower();
		h.setHero(new Thor());
		h.showPower();
		
	}

}

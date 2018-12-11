package strategyPattern;

public class SPDemo {

	public static void main(String[] args) {

		SuperHero h = new SuperHero();
		
		h.setHero(new Hulk());
		h.executeUpdate();
		h.setHero(new IronMan());
		h.executeUpdate();
		h.setHero(new Thor());
		h.executeUpdate();
		
	}

}

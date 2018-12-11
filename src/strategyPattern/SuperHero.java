package strategyPattern;

public class SuperHero {

	public Hero h;
	
	public void showPower()
	{
		h.updateHero();
	}

	public void setHero(Hero h) {
		this.h = h;
	}
	
}

package strategyPattern;

public class SuperHero {

	public hero h;
	
	public void executeUpdate()
	{
		h.updateHero();
	}

	public void setHero(hero h) {
		this.h = h;
	}
	
}

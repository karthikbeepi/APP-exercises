package builderPattern;

public abstract class LaptopBuilder {

	protected Laptop ob = new Laptop();
	public abstract void buildComponents();
	public abstract void installOS();
	public abstract void assignPrice();
	public builderPattern.Laptop createLaptop()
	{
		buildComponents();
		installOS();
		assignPrice();
		return ob;
	}

}

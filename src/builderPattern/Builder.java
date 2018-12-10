package builderPattern;
public class Builder {

	LaptopBuilder b;
	public Builder(LaptopBuilder t) {
		b = t;
	}
	
	public builderPattern.Laptop createLaptop()
	{
		b.buildComponents();
		b.installOS();
		b.assignPrice();
		return b.getLaptop();
	}
}

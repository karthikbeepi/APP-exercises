package builderPattern;

public class Apple extends LaptopBuilder{
	@Override
	public void buildComponents() {
			ob.h = hardwareBuilt.good;
	}

	@Override
	public void installOS() {
			ob.o = osInstalled.MACOS;
	}

	@Override
	public void assignPrice() {
		
		ob.p = price.high;
		
	}
}

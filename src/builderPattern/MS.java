package builderPattern;

public class MS extends LaptopBuilder{

	@Override
	public void buildComponents() {
			ob.h = hardwareBuilt.bad;
	}

	@Override
	public void installOS() {
			ob.o = osInstalled.Windows;
	}

	@Override
	public void assignPrice() {
		ob.p = price.low;
	}
}

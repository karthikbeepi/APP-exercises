package factoryPattern;

public class FactoryCreator {

	private FactoryCreator() {
	}
	
	public static Calculator createCalc(String s)
	{
		switch(s)
		{
		case "m":
			return new Mobile();
		case "l":
			return new Laptop();
		}
		return null;
	}
	
}

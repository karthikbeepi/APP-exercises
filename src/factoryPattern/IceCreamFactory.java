package factoryPattern;

public class IceCreamFactory {

	private IceCreamFactory()
	{
	}
	
	public static IceCream getIceCream(String i)
	{
		switch(i)
		{
			case "Vanilla": return new Vanilla();
			case "Chocolate": return new Choco();
			case "Purple" : return new BlackCurrant();
			default : return new BlackCurrant();
		}
	}
	
}

package ObserverPattern;

public class Demo {

	public static void main(String[] args) {
		
		LaptopModel ob = new LaptopModel();
		LaptopView obv = new LaptopView();
		
		ob.addObserver(obv);
		ob.start();
		ob.type();
		try
		{
			ob.game();
			ob.browseChrome();
		}
		catch (LaptopCrashException e)
		{
			System.err.println(e.getMessage());
		}
		finally 
		{
			ob.switchOff();
		}
		
		System.out.println("Reached!");
	}

}

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
		}
		catch (LaptopCrashException e)
		{
			System.err.println(e.getMessage());
		}
		catch (Exception e)
		{
			System.err.println("Simply");
		}
		finally 
		{
			ob.switchOff();
		}
		ob.start();
		try {
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
	}

}

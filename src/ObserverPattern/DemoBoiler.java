package ObserverPattern;

public class DemoBoiler {

	public static void main(String[] args) {
		Boiler b = new Boiler();
		Thermometer t = new Thermometer();
		b.addObserver(t);
		
		for(int i=0; i<10; i++)
		{
			b.start();
		}
			
	}

}

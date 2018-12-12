package ObserverPattern;

import java.util.Observable;
import java.util.Observer;

public class Thermometer implements Observer{

	Boiler b = new Boiler();

	@Override
	public void update(Observable arg0, Object arg1) {
		b.temperature = (int) arg1;
		System.out.println("Boiler temperature : "+b.temperature);
	}
	
	
	
	
}

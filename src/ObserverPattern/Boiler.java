package ObserverPattern;

import java.util.Observable;
import java.util.Random;

public class Boiler extends Observable{
	
	int temperature;
	
	public void start()
	{
		Random ran = new Random();
		temperature = ran.nextInt(101);
		setChanged();
		notifyObservers(temperature);
	}

}

package ObserverPattern;

import java.util.Observable;
import java.util.Random;
enum Status{
	Start, Typing, Gaming, ShutDown, OverClocked, Off, Browsing
}

public class LaptopModel extends Observable{

	boolean powerSwitch;
	int processorSpeed;
	Status stat;
	
	public LaptopModel() {
		// TODO Auto-generated constructor stub
		powerSwitch = false;
		processorSpeed = 0;
		stat = stat.Off;
	}
	
	public void start()
	{
		powerSwitch = true;
		processorSpeed = 1;
		stat = stat.Start;
		setChanged();
		notifyObservers(this);
	}
	
	public void type()
	{
		processorSpeed = 2;
		stat = stat.Typing;
		setChanged();
		notifyObservers(this);
	}
	
	public void game() throws LaptopCrashException
	{
		processorSpeed += 10;
		stat = stat.OverClocked;
		stat = stat.Gaming;
		checkProcessor();
		setChanged();
		notifyObservers(this);
	}
	
	public void browseChrome() throws LaptopCrashException
	{
		stat = stat.Browsing;
		processorSpeed += new Random().nextInt(15);
		checkProcessor();
		setChanged();
		notifyObservers(this);
	}
	
	private void checkProcessor() throws LaptopCrashException {
		
		if(processorSpeed>11)
		{
			throw new LaptopCrashException("Overheated due to "+stat);
		}
		setChanged();
		notifyObservers(this);
	}

	public void switchOff()
	{
		powerSwitch= false;
		processorSpeed =0;
		stat = stat.Off;
		setChanged();
		notifyObservers(this);
	}	
	
}

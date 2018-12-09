package ObserverPattern;

import java.util.Observable;
import java.util.Observer;

public class LaptopView implements Observer{
	
	LaptopModel mod;

	@Override
	public void update(Observable arg0, Object arg1) {
		mod = (LaptopModel) arg0;
		System.out.println(mod.stat);
		if(mod.stat==Status.Off)
			System.out.println();
	}
		
}

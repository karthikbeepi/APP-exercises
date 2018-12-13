package adapterPattern;

import java.util.Random;

public class SDCardk implements ISDCard{

	@Override
	public void readSD() throws InvalidCardException {
		
		Random r = new Random();
		
		int i = r.nextInt(2);
		
		if(i==1)
			System.out.println("SD card has been read!");
		else
			throw new InvalidCardException();
	}

}

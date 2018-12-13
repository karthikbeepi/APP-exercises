package adapterPattern;

import java.util.Random;

public class MicroSDk implements IMicroSD {

	@Override
	public void readMicroSD() throws InvalidMicroCardException {
		
		Random r = new Random();
		
		int i = r.nextInt(2);
		
		if(i==1)
			System.out.println("Micro SD card has been read!");
		else
			throw new InvalidMicroCardException();
	}

}

package adapterPattern;

public class TwoWayCardReader implements ISDCard , IMicroSD{

	ISDCard sdc;
	IMicroSD sd;
	
	@Override
	public void readMicroSD() throws  InvalidCardException{
		sdc.readSD();
	}

	@Override
	public void readSD() throws InvalidCardException{
		sd.readMicroSD();
	}

	public void setCard(ISDCard s) {
		
		sdc = s;
		
	}
	
	public void setCard(IMicroSD m)
	{
		sd = m;
	}
	

}

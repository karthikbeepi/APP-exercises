package adapterPattern;

public class InvalidSDCardException extends InvalidCardException {

	public String getMessage()
	{
		return "Invalid SD card!";
	}
}

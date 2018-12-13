package adapterPattern;

public class InvalidMicroCardException extends InvalidCardException {

	public String getMessage()
	{
		return "Invalid Micro SD card!";
	}
}

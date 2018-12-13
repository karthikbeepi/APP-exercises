package adapterPattern;

public class InvalidCardException extends Exception {

	public String getMessage()
	{
		return "Invalid Card";
	}
}

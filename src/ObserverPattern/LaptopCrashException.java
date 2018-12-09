package ObserverPattern;

public class LaptopCrashException extends Exception {

	String s;
	public LaptopCrashException(String msg) {
		// TODO Auto-generated constructor stub
		s = msg;
		
	}
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return s;
	}
}

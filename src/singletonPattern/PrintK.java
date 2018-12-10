package singletonPattern;

public class PrintK {

	static PrintK o = new PrintK();
	
	private PrintK()
	{
	}
	
	public static PrintK getInstance() {
		return o;
	}

	public void print(String s) {
		
		System.err.println(s);
		
	}

}

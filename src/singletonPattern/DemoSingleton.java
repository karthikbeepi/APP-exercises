package singletonPattern;

public class DemoSingleton {

	public static void main(String[] args) {

		PrintK ob = PrintK.getInstance();
		
		ob.print("Hello world");
		
	}

}

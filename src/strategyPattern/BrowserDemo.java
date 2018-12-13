package strategyPattern;

public class BrowserDemo {

	public static void main(String[] args) {

		DefBrowser b = new DefBrowser();
		
		b.setBrowser(new Chrome());
		
		b.surf();
		
		b.setBrowser(new IE());
		
		b.surf();
		
		
	}

}

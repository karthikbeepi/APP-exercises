package decoratorPattern;

public class IphoneDemo {
	
	public static void main(String args[])
	{
		Iphone p = new Iphone();
		new CaliforniaHQ(p);
		new ChinaFactory(p);
		p.getDetails();
	}

}

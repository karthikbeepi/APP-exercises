package decoratorPattern;

public class Iphone {

	String manufacturingSite;
	String designSite;
	
	public void getDetails()
	{
		System.out.println("Iphones are designed at "+designSite+" but manufactured at "+manufacturingSite);
	}
	
}

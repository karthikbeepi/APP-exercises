package builderPattern;
enum hardwareBuilt { good, bad };
enum osInstalled { MACOS, Windows} ;
enum price {high, low};
public class Laptop {

	hardwareBuilt h;
	osInstalled o;
	price p;
	
	public void getDetails()
	{
		System.out.println("HW quality : "+h+"\n"+"OS : "+o+"\nPrice : "+p+"\n");		
	}
	
}

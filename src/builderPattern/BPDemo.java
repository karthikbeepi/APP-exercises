package builderPattern;


public class BPDemo {

	public static void main(String args[])
	{
		Builder b1 = new Builder(new Apple());
		Builder b2 = new Builder(new MS());
		
		Laptop ob = b1.createLaptop();
		ob.getDetails();
		
		ob = b2.createLaptop();
		ob.getDetails();
				
	}
	
}

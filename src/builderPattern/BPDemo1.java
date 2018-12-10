package builderPattern;

public class BPDemo1 {

	public static void main(String args[])
	{
		LaptopBuilder b1 = new  Apple();
		LaptopBuilder b2 = new MS();
		
		Laptop ob = b1.createLaptop();
		ob.getDetails();
		
		ob = b2.createLaptop();
		ob.getDetails();
				
	}
}

package adapterPattern;

public class APDemo {

	public static void main(String[] args) {

		IndianPlug p1 = new IndianPlug();
		CanadianPlug p2 = new CanadianPlug();
		
		IndianSocket s1 = new IndianSocket(p1);
		CanadianSocket s2 = new CanadianSocket(p2);
		
		CanadianSocket s3 = new CanadianToIndianSocket(p1);
		
	}

}

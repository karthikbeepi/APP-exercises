package adapterPattern;

public class CanadianToIndianSocket extends CanadianSocket{

	IndianSocket s;
	public CanadianToIndianSocket(IndianPlug p) {
		
		s = new IndianSocket(p);
		
	}
	
	public void addPlug(IndianPlug p1) {
		
	}
	
}

package adapterPattern;

public class IndianSocket {
	
	public IndianSocket(IndianPlug p1) {
		System.out.println(p1.getClass()+" plugged into "+this.getClass());
	}

	public void addPlug(IndianPlug p1) {
		
	}

}

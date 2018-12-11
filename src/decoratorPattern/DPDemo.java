package decoratorPattern;

public class DPDemo {

	public static void main(String[] args) {
		
		Car a = new NormalCar();
		
		a.getDetails();
		
		new CustomCar(a);
		
		a.getDetails();
		
	}

}

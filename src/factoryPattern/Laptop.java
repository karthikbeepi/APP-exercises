package factoryPattern;

public class Laptop implements Calculator{

	public Laptop() {
		basicOperations();
	}
	@Override
	public void basicOperations() {
		System.out.println("Able to perform basic operations! by "+this.getClass());		
	}
}

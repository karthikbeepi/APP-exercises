package factoryPattern;

public class Mobile implements Calculator{

	public Mobile() {
		basicOperations();
	}
	@Override
	public void basicOperations() {
		System.out.println("Able to perform basic operations! by "+this.getClass());		
	}

}

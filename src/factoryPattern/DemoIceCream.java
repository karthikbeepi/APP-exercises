package factoryPattern;

public class DemoIceCream {

	public static void main(String[] args) {
	
		IceCream t = IceCreamFactory.getIceCream("Vanilla");
		System.out.println(t.getTaste());
		t = IceCreamFactory.getIceCream("Purple");
		System.out.println(t.getTaste());
		t = IceCreamFactory.getIceCream("Chocolate");
		System.out.println(t.getTaste());

	}

}

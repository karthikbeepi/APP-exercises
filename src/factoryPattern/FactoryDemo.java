package factoryPattern;

public class FactoryDemo {

	public static void main(String[] args) {

		Calculator ob ;
		
		ob = FactoryCreator.createCalc("m");
		ob = FactoryCreator.createCalc("l");
	}

}

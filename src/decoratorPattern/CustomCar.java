package decoratorPattern;

public class CustomCar extends Car{

	Car temp;
	
	public CustomCar(Car a) {
		temp = a;
		addLight();
		addMatte();
	}

	public void addMatte()
	{
		temp.c = carPaint.matte;
	}
	
	public void addLight()
	{
		temp.h = headLight.high;
	}
	
}

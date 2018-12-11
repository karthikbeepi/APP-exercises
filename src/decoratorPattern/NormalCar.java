package decoratorPattern;

public class NormalCar extends Car {

	public NormalCar()
	{
		System.out.println("Normal Car built");
		this.c = carPaint.normal;
		this.h = headLight.low;
	}
	
}

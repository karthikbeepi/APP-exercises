package decoratorPattern;

enum carPaint {normal, matte };
enum headLight { low, high};

public class Car {

	carPaint c;
	headLight h;
	
	public void getDetails()
	{
		System.out.println("Car paint:"+c+"\n"+"Head light:"+h);
	}
	
}

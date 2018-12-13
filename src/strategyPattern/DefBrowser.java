package strategyPattern;

public class DefBrowser {

	Browser b;
	
	public void setBrowser(Browser b)
	{
		this.b = b;
	}

	public void surf() {
		
		b.surfNet();
		
	}
		
}

package strategyPattern;

public class IE implements Browser {

	@Override
	public void surfNet() {

		System.out.println("IE: Wait");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("IE: Finally done!");
	
		
	}

}

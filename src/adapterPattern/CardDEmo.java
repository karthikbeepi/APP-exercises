package adapterPattern;

public class CardDEmo {

	public static void main(String[] args) {
		
		TwoWayCardReader reader = new TwoWayCardReader();
		reader.setCard(new SDCardk());
		reader.setCard(new MicroSDk());
		
		try {
			reader.readSD();
		} catch (InvalidCardException e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
		}
		
		catch(Exception e)
		{
			System.err.println(e.getMessage());
		}
		
		try {
			reader.readMicroSD();
		} catch (InvalidCardException e) {
			System.err.println(e.getMessage());
		}
		
		catch(Exception e)
		{
			System.err.println(e.getMessage());
		}
		
		}

}

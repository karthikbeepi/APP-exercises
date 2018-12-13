package generics;

import java.util.ArrayList;

public class DemoFruit {

	public static void main(String[] args) {

		ArrayList<Fruits> al = new ArrayList<>();
		
		try {
			al.add((Fruits) new Object());	
		}
		catch(Exception e)
		{
			System.err.println(e.getMessage());
		}
		
		al.add(new Apple());
		al.add(new Orange());
		al.add(new Watermelon());
		
		for(Fruits f : al)
		{
			f.getDetails();
		}
		
		System.out.println();
		
		ListFruits.sortAndDisplay(al);
		
		for(Fruits f : al)
		{
			f.getDetails();
		}
		
	}

}

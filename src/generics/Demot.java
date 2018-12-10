package generics;

public class Demot {

	public static void main(String args[])
	{
		QK<Integer> ob1 = new QK<>();
		QK<Double> ob2 = new QK<>();
		QK<String> ob3 = new QK<>();
		
		TreeK<Integer> ob4 = new TreeK<Integer>();
		
		ob1.add(5);
		ob1.add(6);
		ob1.add(7);
		
		ob2.add(5.0);
		ob2.add(15.0);
		
		ob3.add("Hello");
		ob3.add("world!");
		
		try {
			ob4.add(6);
			ob4.add(7);
			ob4.add(9);
			ob4.add(4);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(ob1+"\n"+ob2+"\n"+ob3+"\n"+ob4);
	}
	
}

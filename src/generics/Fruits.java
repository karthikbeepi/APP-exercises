package generics;

public abstract class Fruits implements Comparable<Fruits> {

	public int compareTo(Fruits arg0) {
		return this.getWt()-arg0.getWt();
	}

	public abstract String getColor();
	public abstract int getWt();
	public void getDetails() {

		System.out.println(this.getClass()+" are "+getColor()+" and weigh "+getWt());
		
	}
}

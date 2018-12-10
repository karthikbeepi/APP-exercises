package generics;

public class nodeKT<T extends Number> implements Comparable<T>{

	T data;
	nodeKT<T> next;
	nodeKT<T> nextr;
	public nodeKT(T temp) {
		data = temp;
		next = null;
		nextr = null;
	}
	public String toString()
	{
		return new String(data.toString()); 
	}
	@Override
	public int compareTo(T arg0) {
		return this.data.intValue() - arg0.intValue();
	}
	
}

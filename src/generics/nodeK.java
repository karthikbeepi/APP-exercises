package generics;

public class nodeK<T>{

	T data;
	nodeK<T> next;
	nodeK<T> nextr;
	public nodeK(T temp) {
		data = temp;
		next = null;
		nextr = null;
	}
	public String toString()
	{
		return new String(data.toString()); 
	}
}

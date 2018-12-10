package generics;

import java.util.ArrayList;

public class QK<T> {

	nodeK<T> front;
	nodeK<T> last;
	int size;
	
	public QK() {
		front = null;
		last = null;
		size =0;
	}
	public void add(T g)
	{
		
		if(last==null)
		{
			front = new nodeK<T>(g);
			last = front;
		}
			
		else
		{
			nodeK<T> temp = new nodeK<T>(g);
			last.next = temp;
			last = temp;
		}
		
		size++;
	}
	
	public String toString() {
		ArrayList<String> ob = new ArrayList<>();
		nodeK<T> temp = front;
		while(temp!=null)
		{
			ob.add(temp.toString());
			temp = temp.next;
		}
		return ob.toString();
			
	}
	
}

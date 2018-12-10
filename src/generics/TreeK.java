package generics;

import java.util.ArrayList;

public class TreeK<T extends Number> {

	nodeKT<T> root;
	ArrayList<nodeKT<T>> ar = new ArrayList<>();
	int noOfNodes = 0;
	
	public TreeK() {
		
	}
	
	public void add(T t) throws Exception
	{
		if(root==null)
			root = new nodeKT<T>(t);
		nodeKT<T> cur = root;
		if(cur.compareTo(t)<0)
			cur.next = new nodeKT<T>(t);
		else if(cur.compareTo(t)>0)
			cur.nextr = new nodeKT<T>(t);
		else
			throw new Exception("Element is already present");
		noOfNodes++;
	}
	
		
	
	public String toString()
	{

		preorder(root);
		
		return ar.toString();
	}

	private void preorder(nodeKT<T> root) {
		
		if(root.next!=null)
			preorder(root.next);
		ar.add(root);
		if(root.nextr!=null)
			preorder(root.nextr);
		}
}

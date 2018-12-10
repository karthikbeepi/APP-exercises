package generics;

public class Matrix<T extends Number> {

	public T[][] mat = null;
	int n, m;
	
	public Matrix(int n, int m) {
		this.n = n;
		this.m = m;
	}
	
	public boolean intialize(T[] ar)
	{
		int k=0;
		for(int i=0; i<m; i++)
			for(int j=0; j<n; j++)
				mat[i][j] = ar[k++];
		return true;
	}
	
	public void insert(int i, int j, T temp) {
		
	}

	public double add(T t, T t2) {
		return  t.doubleValue() + t2.doubleValue();
	}
	
	
}

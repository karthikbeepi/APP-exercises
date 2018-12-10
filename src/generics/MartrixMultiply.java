package generics;

public class MartrixMultiply {
	
	private MartrixMultiply() {
		// Can't be instantiated.
	}

	public static <T extends Number> Matrix<T> multiply(Matrix<T> a, Matrix<T> b) throws Exception
	{
		Matrix<T> c = null;
		if(a.n!=b.m)
			throw new Exception("Can't be mutliplied!");
		c = new Matrix<>(a.m, b.n);
		for(int i=0; i<a.m; i++)
			for(int j=0; j<b.n; j++)
				for(int k=0; k<b.m; k++)
				{
					double temp += a.add(a.mat[i][k], b.mat[k][j]) ;
					c.insert(i, j, temp);
				}
		return c;
		
	}
}

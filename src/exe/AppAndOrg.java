package exe;
import java.util.*;

public class AppAndOrg {

	public static int noOfAppNearHouse;
	public static int noOfOragNearHouse;
    // Complete the countApplesAndOranges function below.
    /**
     * @param s
     * @param t
     * @param a
     * @param b
     * @param apples
     * @param oranges
     */
    public static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
    	
    	int[] appleFallen = updateFruitFallen(apples, a);
    	
    	int[] orangeFallen = updateFruitFallen(oranges, b);
    	
    	noOfAppNearHouse = countFruitNearHome(appleFallen, s, t);
    	
    	noOfOragNearHouse = countFruitNearHome(orangeFallen, s, t);
    	
    	System.out.println(noOfAppNearHouse+"\n"+noOfOragNearHouse);

    }

    private static int countFruitNearHome(int[] fruitFallen, int start, int end) {
		
    	int ctr = 0 ;
    	
    	for(int fruit: fruitFallen)
    		if(fruit>=start && fruit<=end)
    			ctr++;
    	
    	return ctr;
	}

	private static int[] updateFruitFallen(int[] fruits, int treepos) {
		
    	int[] newFruitsPos = new int[fruits.length];
    	
    	for(int i=0; i<fruits.length; i++)
    		newFruitsPos[i] = fruits[i] + treepos;
    	
    	return newFruitsPos;
	}

	private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] st = scanner.nextLine().split(" ");

        int s = Integer.parseInt(st[0]);

        int t = Integer.parseInt(st[1]);

        String[] ab = scanner.nextLine().split(" ");

        int a = Integer.parseInt(ab[0]);

        int b = Integer.parseInt(ab[1]);

        String[] mn = scanner.nextLine().split(" ");

        int m = Integer.parseInt(mn[0]);

        int n = Integer.parseInt(mn[1]);

        int[] apples = new int[m];

        String[] applesItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            int applesItem = Integer.parseInt(applesItems[i]);
            apples[i] = applesItem;
        }

        int[] oranges = new int[n];

        String[] orangesItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int orangesItem = Integer.parseInt(orangesItems[i]);
            oranges[i] = orangesItem;
        }

        countApplesAndOranges(s, t, a, b, apples, oranges);

        scanner.close();
    }
}

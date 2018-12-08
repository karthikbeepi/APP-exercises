package exe;
import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

public class BirthDayChoc {

    // Complete the birthday function below.
    public static int birthday(List<Integer> s, int day, int month) {

    	int noOfSegments = 0;
    	for(int i=0; i<s.size()-month+1; i++)
    	{
    		if(checkCondition(i, i+month, day, s))
    			noOfSegments++;
    	}
    	
    	return noOfSegments;
    }

    private static boolean checkCondition(int start, int end, int sum, List<Integer> s) {
	
    	int seg =0;
    	
    	for(int i=start ; i<end; i++)
    		seg += s.get(i);
    	
    	if(seg==sum)
    		return true;
    	else
    		return false;
	}

	public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> s = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        String[] dm = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int d = Integer.parseInt(dm[0]);

        int m = Integer.parseInt(dm[1]);

        int result = birthday(s, d, m);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

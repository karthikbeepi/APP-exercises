package exe;

import java.io.*;
import java.util.*;

public class LibraryFine {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String temp[] = null;
		try {
			temp = br.readLine().split(" ");
		} catch (IOException e) {
			e.printStackTrace();
		}
        int[] actual = new int[3];
        for(int i=0; i<3; i++)
        	actual[i] = Integer.parseInt(temp[i]);
        try {
			temp = br.readLine().split(" ");
		} catch (IOException e) {
			e.printStackTrace();
		}
        int[] expected = new int[3];
        for(int i=0; i<3; i++)
        	expected[i] = Integer.parseInt(temp[i]);
        
        int fine=0;

        if(actual[2]<expected[2])
        	fine = 0;
        
        else if(actual[2]==expected[2])
        {
        	if(actual[1]<expected[1])
            	fine = 0;
            
            else if(actual[1]==expected[1])
            {
            	if(actual[0]<=expected[0])
                	fine = 0;
                
            	else
            		fine = 15 * (actual[0]-expected[0]);
            }
            
            else
            	fine = 500 * (actual[1]-expected[1]);
        }
        
        else
        	fine = 10000;
        System.out.println(fine);
        
    }
}


package test;
import exe.AppAndOrg;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppAndOrgTest {

	@Test
	public void test1()
	{
		AppAndOrg ob = new AppAndOrg();
		int[] apples = {-2,2,1 };
		int[] oranges = {5,-6};
		ob.countApplesAndOranges(7, 11, 5, 15, apples, oranges);
		assertEquals(1 , ob.noOfAppNearHouse);
		assertEquals(1 , ob.noOfOragNearHouse);
	}
	
	@Test
	public void test2()
	{
		AppAndOrg ob = new AppAndOrg();
		int[] apples = {2 };
		int[] oranges = {-2};
		ob.countApplesAndOranges(2, 3, 1, 5, apples, oranges);
		assertEquals(1 , ob.noOfAppNearHouse);
		assertEquals(1 , ob.noOfOragNearHouse);
	}
	

}

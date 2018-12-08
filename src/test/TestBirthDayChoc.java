package test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import exe.BirthDayChoc;

public class TestBirthDayChoc {

	@Test
	public void TestBirthday1()
	{
		BirthDayChoc ob = new BirthDayChoc();
		ArrayList<Integer> seg = new ArrayList<>();
		seg.add(1);
		seg.add(2);
		seg.add(1);
		seg.add(3);
		seg.add(2);
		int d = 3, m = 2;
		assertEquals( 2, ob.birthday(seg, d, m));
	}
	
	@Test
	public void TestBirthday2()
	{
		BirthDayChoc ob = new BirthDayChoc();
		ArrayList<Integer> seg = new ArrayList<>();
		
		seg.add(1);
		seg.add(1);
		seg.add(1);
		seg.add(1);
		seg.add(1);
		seg.add(1);
		
		int d = 3, m = 2;
		assertEquals( 0, ob.birthday(seg, d, m));
	}

	@Test
	public void TestBirthday3()
	{
		BirthDayChoc ob = new BirthDayChoc();
		ArrayList<Integer> seg = new ArrayList<>();
		
		seg.add(4);
		seg.add(5);
		seg.add(4);
		int d = 4, m = 1;
		assertEquals(2, ob.birthday(seg, d, m));
	}
}

package test;

import static org.junit.Assert.*;

import org.junit.Test;

import exe.SockMerchant;

public class SockMerchantTest {

	@Test
	public void testSockMerchant() {
		SockMerchant ob = new SockMerchant();
		int temp[] = {10, 20, 20, 10, 10, 30, 50, 10, 20};
		 assertEquals(3, ob.sockMerchant(9 , temp));
		
	}

}

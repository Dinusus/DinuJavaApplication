package com.ictacademy.homework;

import static org.junit.Assert.*;

import org.junit.Test;

public class SimpleInterestTest {
SimpleInterest testsi=new SimpleInterest();
Perimeter testp=new Perimeter();
Swapnum testsp=new Swapnum();
CompoundInterest testci=new CompoundInterest();
	
	@Test
	public void test() {
		int s = testsi.sim(9000, 3, 2);
		assertEquals(540,s);

}
	
	@Test
	
	public void test1()
	{
		int pr=testp.per(6, 5);
		assertEquals(22,pr);
	}
	
	@Test
	public void test2()
	{
		int swap=testsp.swp(10, 20);
		assertEquals(20,10,swap);
	}

	@Test
	public void test3()
	{
		int c=testci.com(9000, 3, 2);
		assertEquals(18000,c);
	}
	

	
	}

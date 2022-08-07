package com.ictacademy.homework;

public class CompoundInterest {
	public int com(int p,int r,int t)
	{
		int ci,a;
		a=p*(1+(r/100)^t);
		ci=a-p;
		System.out.println("Compound Interest is "+ci);
		return ci;
	}

}

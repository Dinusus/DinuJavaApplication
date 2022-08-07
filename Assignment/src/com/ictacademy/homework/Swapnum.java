package com.ictacademy.homework;

public class Swapnum {
public int swp(int a,int b)
{
	int c,d;
	System.out.println("Enter the value of a :" +a);
	System.out.println("Enter the value of b :" +b);
	b=a+b;
	a=b-a;
	b=b-a;
	c=a;
	d=b;
	System.out.println("****After Swapping****");
	System.out.println("Enter the value of a :" +c);
	System.out.println("Enter the value of b :" +d);

	return a;

}
}

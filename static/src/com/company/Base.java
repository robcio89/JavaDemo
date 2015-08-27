package com.company;

/**
 * Created by Robert on 2015-08-27.
 */
public class Base {

	static int x = 0;

	public Base()
	{
		System.out.println("Hello world");
		++x;
	}

	public int getX()
	{
		return x;
	}
}

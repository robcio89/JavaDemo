package com.robert;

/**
 * Created by Robert on 2015-05-21.
 */
public abstract class Person {

	private String name;

	public Person()
	{
		name = "Person";
	}

	public Person(String n)
	{
		name = n;
	}

	public String getName()
	{
		return name;
	}

	public abstract String getDescription();
}

package com.robert;

/**
 * Created by Robert on 2015-05-26.
 */
public class Student extends Person {

	private String major;

	public Student(String n, String m)
	{
		super(n);
		major = m;
	}

	public String getDescription()
	{
		return "student specjalizacji: " + major;
	}
}

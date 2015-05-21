package com.robert;

import java.util.Date;
import java.util.GregorianCalendar;
import java.lang.Class;
import java.lang.Object;

/**
 * Created by robert on 2015-05-18.
 */
public class Employee extends Person
{
	private String name;
	private double salary;
	private Date hireDay;

	public Employee()
	{
		name = "Jan Kowalski";
	}

	public Employee(String n, double s, int year, int month, int day)
	{
		name = n;
		salary = s;
		GregorianCalendar cal = new GregorianCalendar(year, month - 1, day);
		hireDay = cal.getTime();
	}

	public String getName()
	{
		return name;
	}

	public double getSalary()
	{
		return salary;
	}

	public Date getHireDay()
	{
		return hireDay;
	}

	public void raiseSalary(double percent)
	{
		double raise = salary * percent / 100;
		salary += raise;
	}

	public String getDescription()
	{
		String className = getClass().getSimpleName();
		return className + ": " + name;
	}
}

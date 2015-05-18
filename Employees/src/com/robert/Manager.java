package com.robert;

/**
 * Created by robert on 2015-05-18.
 */
public class Manager extends Employee
{
	private double bonus;

	public Manager()
	{
		super();
	}

	public Manager(String n, double s, int year, int month, int day)
	{
		super(n, s, year, month, day);
		bonus = 0;
	}

	public double getSalary()
	{
		double baseSalary = super.getSalary();

		return baseSalary + bonus;
	}

	public void setBonus(double b)
	{
		bonus = b;
	}
}

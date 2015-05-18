package com.robert;

import org.junit.Test;

import java.util.GregorianCalendar;

import static org.junit.Assert.*;

/**
 * Created by robert on 2015-05-18.
 */
public class EmployeeTest {
	Employee emp = new Employee("Adam Nowak", 36000, 2010, 9, 6);

	@Test
	public void testGetName() throws Exception {
		Employee e = new Employee();

		assertEquals(e.getName(), "Jan Kowalski");
	}

	@Test
	public void testGetName2() throws Exception {

		assertEquals(emp.getName(), "Adam Nowak");
	}

	@Test
	public void testGetSalary() throws Exception {
		assertEquals(emp.getSalary(), 36000, 0);
	}

	@Test
	public void testGetHireDay() throws Exception {
		GregorianCalendar cal = new GregorianCalendar(2010, 8, 6);
		assertEquals(emp.getHireDay(), cal.getTime());
	}

	@Test
	public void testRaiseSalary() throws Exception {
		assertEquals(emp.getSalary(), 36000, 0);

		emp.raiseSalary(10);

		assertEquals(emp.getSalary(), 39600, 0);
	}
}
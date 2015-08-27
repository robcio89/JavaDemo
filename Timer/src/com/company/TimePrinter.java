package com.company;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.util.Date;

/**
 * Created by Robert on 2015-08-27.
 */
public class TimePrinter implements ActionListener {
	public void actionPerformed(ActionEvent event) {
		Date now = new Date();
		System.out.println("Kiedy uslyszysz dzwiek, bedzie godzina " + now);
		Toolkit.getDefaultToolkit().beep();
	}
}

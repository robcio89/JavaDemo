package com.company;
import javax.swing.*;
import java.awt.event.ActionListener;


public class Main {

    public static void main(String[] args) {
        ActionListener listener = new TimePrinter();

        Timer t = new Timer(5000, listener);
        t.start();

        JOptionPane.showMessageDialog(null, "Zamknac program");
        System.exit(0);
    }
}

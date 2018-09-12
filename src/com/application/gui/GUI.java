package com.application.gui;

import javax.swing.JFrame;

/*
 * HelloWorldSwing.java requires no other files. 
 */
import javax.swing.*;        
 
public class GUI {
    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event-dispatching thread.
     */
	public GUI() {
		initGUI();
	}
	
    private static void initGUI() {
        //Create and set up the window.
    	JFrame frame = new JFrame();
    	JLabel label  = new JLabel();
    	JButton button = new JButton();
    	
    	//label.setBounds(130, 100, 100, 40);
    	
    	
    	
    	frame.add(label);
    	frame.setSize(400, 500);
    	frame.setLayout(null);
    	frame.setVisible(true);
    }
}

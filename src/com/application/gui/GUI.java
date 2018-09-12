package com.application.gui;

import javax.swing.JFrame;

import java.awt.Rectangle;

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
    	JFrame frame = new JFrame("System Test");
    	JLabel label  = new JLabel("Test Text");
    	JButton reqDataButton = new JButton("reqData");
    	JButton dataRecievedButton = new JButton("dataRecieved");
    	JTextArea timeEvent = new JTextArea("\n\ntimeEvent()", 20, 20);
    	JTextArea checkSumProperty = new JTextArea("\n\ncheckSum\nProperty", 20, 20);
    	
    	label.setBounds(10, 10, 100, 40);
    	reqDataButton.setBounds(10, 50, 100, 40);
    	dataRecievedButton.setBounds(10, 100, 100, 40);
    	timeEvent.setBounds(120, 50, 100, 90);
    	checkSumProperty.setBounds(230, 50, 100, 90);
    	
    	
    	frame.add(label);
    	frame.add(reqDataButton);
    	frame.add(dataRecievedButton);
    	frame.add(timeEvent);
    	frame.add(checkSumProperty);
    	frame.setSize(400, 500);
    	frame.setLayout(null);
    	frame.setVisible(true);
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

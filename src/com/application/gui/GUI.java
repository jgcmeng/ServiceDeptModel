package com.application.gui;

import javax.swing.JFrame;

import com.application.context.Car;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
	private static JFrame frame = new JFrame("System Test");
	public static JLabel label  = new JLabel("Test Text");
	public static JButton reqDataButton = new JButton("reqData");
	public static JButton dataRecievedButton = new JButton("dataRecieved");
	public static JTextArea timeEvent = new JTextArea("\n\ntimeEvent()", 20, 20);
	public static JTextArea checkSumProperty = new JTextArea("\n\ncheckSum\nProperty", 20, 20);
	public static JTextArea debugOutView = new JTextArea("\n\nDEBUG TEXT", 20, 20);
	
	
	public GUI(Car car) {
		initGUI(car);
	}
	
    private static void initGUI(Car car) {
        //Create and set up the window.
    	
    	label.setBounds(10, 10, 100, 40);
    	reqDataButton.setBounds(10, 50, 100, 40);
    	dataRecievedButton.setBounds(10, 100, 100, 40);
    	timeEvent.setBounds(120, 50, 100, 90);
    	checkSumProperty.setBounds(230, 50, 100, 90);
    	debugOutView.setBounds(10, 150, 320, 90);
    	
    	reqDataButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				car.reqData();
			}
    		
    	});
    	
    	dataRecievedButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				car.dataRecieved();
			}
		});
    	
    	frame.add(label);
    	frame.add(reqDataButton);
    	frame.add(dataRecievedButton);
    	frame.add(timeEvent);
    	frame.add(checkSumProperty);
    	frame.add(debugOutView);
    	frame.setSize(400, 500);
    	frame.setLayout(null);
    	frame.setVisible(true);
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

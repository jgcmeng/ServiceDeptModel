package com.application.gui;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;

import com.application.context.Car;

public class GUI extends JFrame {
       
       private static final long serialVersionUID = 1L; // Standard line (not sure why)
       // Declare the buttons and the output text
       public static JButton onDo1;
       public static JButton onDo2;
       public static JButton onDo3;
       public static JButton onDo4;
       public static JTextArea l1;
       // Declare the split pane and panels
       public JSplitPane splitPane;
       public JPanel subPanel1;
       public JPanel subPanel2;

       public GUI(final Car car){
              
              super("System Test"); // Call the JFrame constructor
              initGUI(car);

       }
       
       private void initGUI(Car car){
              // Declare the buttons and the output text
              onDo1 = new JButton("reqData()");
              onDo2 = new JButton("dataRevieved");
              onDo3 = new JButton("ev3_unattached");
              onDo4 = new JButton("ev4-unattached");
              l1 = new JTextArea("New Text");
              // Declare the split pane and panels
              splitPane = new JSplitPane();
              subPanel1 = new JPanel(new GridBagLayout());
              subPanel2 = new JPanel(new GridBagLayout());
              
              splitFrame(); // Fuction to split the frame vertically into two panes
        addComponents(); // Function adds the components into the grids in the panes
        addListeners(car); // Function adds listeners to the button elements
        
        setLocationRelativeTo(null); // Not sure what this one does
        pack(); // Pack to ensure that elements are placed before the frame is visible
              
              setVisible(true); // Show the JFrame
              setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// Set the close behavor
       }
       
       private void splitFrame(){
        // configure size of main JFrame
        setPreferredSize(new Dimension(800,200));
        getContentPane().setLayout(new GridLayout());
        getContentPane().add(splitPane);
        
        // Configure the split pane
        splitPane.setOrientation(JSplitPane.HORIZONTAL_SPLIT);
        splitPane.setDividerLocation(300);
        splitPane.setTopComponent(subPanel1); // Add panels to pane
        splitPane.setBottomComponent(subPanel2); // Add panels to pane
       }
       
       private void addComponents(){
              // Configure the constraints to place elements in the sub panel grids
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.anchor = GridBagConstraints.WEST;
        constraints.insets = new Insets(5, 5, 5, 5);
        constraints.fill = GridBagConstraints.BOTH;
         
        // Add components to the panel
        // Note>> the constraints are applied to both panels
        constraints.gridx = 0;
        constraints.gridy = 0;      
        subPanel1.add(onDo1, constraints); // Add button to pane 1

        constraints.gridx = 1;
        subPanel1.add(onDo2, constraints); // Add button to pane 1
         
        constraints.gridx = 0;
        constraints.gridy = 1;      
        subPanel1.add(onDo3, constraints); // Add button to pane 1
        subPanel2.add(l1, constraints); // Add button to pane 2
        
        constraints.gridx = 1;
        constraints.gridy = 1;
        subPanel1.add(onDo4, constraints); // Add button to pane 1
        

        // Set border for sub panel 1 
        subPanel1.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createEtchedBorder(), "Events"));
        
        // Set border for sub panel 2 
        subPanel2.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createEtchedBorder(), "Debug"));
       }
       
       private void addListeners(final Car car){
              // Add listener to the first event
              onDo1.addActionListener(new ActionListener(){
                     // Listener definition 
                     @Override
                     public void actionPerformed(ActionEvent e) {
                           // Action performed action
                           l1.setText(car.reqData()); // Call the car event and append the result to the debug
                     }
              });
              // Add listener to the second event
              onDo2.addActionListener(new ActionListener(){
                     // Listener definition
                     @Override
                     public void actionPerformed(ActionEvent e) {
                           // TODO Auto-generated method stub
                           l1.setText(car.dataRecieved()); // Call the car event and append the result to the debug
                     }
              });
       }
}

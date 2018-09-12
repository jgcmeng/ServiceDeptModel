package com.application.context;

import com.application.gui.GUI;
import com.application.state.IState;
import com.application.states.StoringData;

public class Car{
	
	// A comment
	// Another comment
	IState state;
	GUI myGui;
	
	public Car(){
		 initUI();
	}
	
	private void initUI() {
		
		this.state = new StoringData();
		this.myGui = new GUI(this);
        
    }
	
	public void setState(IState newState) {
		this.state = newState;
	}
	
	public void runApp() {
		state.running(this, myGui);
	}
	
	public void saySomething() {
		
	}
	
	public void closeApp() {
		System.out.println("");
	}
	
	public void reqData() {
		this.state.reqData(this, myGui);
	}
	
	public void dataRecieved() {
		this.state.dataRecieved(this, myGui);
	}
	
}


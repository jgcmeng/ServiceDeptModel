package com.application.context;

import java.util.Timer;
import com.application.Timer.Task;
import com.application.gui.GUI;
import com.application.state.IState;
import com.application.states.StoringData;

public class Car{
	// A comment
	IState state;
	GUI myGui;
	Timer clock;
	Task task;
	
	public Car(){
		 initUI();
	}
	
	private void initUI() {
		// Comment
		this.state = new StoringData();
		this.task = new Task(this);
		this.myGui = new GUI(this);
		clock = new Timer();
		clock.scheduleAtFixedRate(task, 0, 1000);
		
    }
	
	public void setState(IState newState) {
		this.state = newState;
		
	}
	
	public void runApp() {
		state.running(this, myGui);
		
	}
	
	public String reqData() {
		return this.state.reqData(this, myGui);
		
	}
	
	public String dataRecieved() {
		return this.state.dataRecieved(this, myGui);
		
	}
	
	public void timerEvent() {
		this.state.timeEvent(this, myGui);
		
	}
	
}


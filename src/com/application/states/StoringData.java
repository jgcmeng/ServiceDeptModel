package com.application.states;

import com.application.context.Car;

import com.application.gui.GUI;
import com.application.state.IState;

public class StoringData implements IState {
	
	private Long startTime = System.currentTimeMillis();
	private long mySeconds = 0;

	@Override
	public void running(Car myApp, GUI myGui) {
		// TODO Auto-generated method stub

	}

	@Override
	public void returnMessage(Car myApp, GUI myGui) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public String reqData(Car myApp, GUI myGui) {
		// set the req button text
		myApp.setState(new ProcessingData());
		return " Moving to the Processing Data state ";
	}

	@Override
	public String dataRecieved(Car myApp, GUI myGui) {
		// TODO Auto-generated method stub
		return "Testing";
	}

	@Override
	public void timeEvent(Car myApp, GUI myGui) {
		// TODO Auto-generated method stub
		mySeconds++;
		GUI.onDo3.setText(Long.toString(mySeconds));

	}

}

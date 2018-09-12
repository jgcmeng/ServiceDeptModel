package com.application.states;

import com.application.context.Car;
import com.application.gui.GUI;
import com.application.state.IState;

public class ProcessingData implements IState {
	//There will be a handler for the chkSum change
	//This will transition to the Sending State

	@Override
	public void running(Car myApp, GUI myGui) {
		// TODO Auto-generated method stub

	}

	@Override
	public void returnMessage(Car myApp, GUI myGui) {
		// TODO Auto-generated method stub

	}

	@Override
	public void reqData(Car myApp, GUI myGui) {
		// TODO Auto-generated method stub
		GUI.debugOutView.setText("Nothing will happen when you make a request\n"
				+ " in the Processing Data state\n\nI'm waiting for - checkSum\n"
				+ " = true");

	}

	@Override
	public void dataRecieved(Car myApp, GUI myGui) {
		// TODO Auto-generated method stub
		GUI.debugOutView.setText("data can only be recieved after it has been\n"
				+ "sent out....this will happen from the Sending Data state.");
	}

	@Override
	public void timeEvent(Car myApp, GUI myGui) {
		// TODO Auto-generated method stub

	}

}

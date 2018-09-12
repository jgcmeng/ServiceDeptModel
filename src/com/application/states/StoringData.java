package com.application.states;

import com.application.context.Car;

import com.application.gui.GUI;
import com.application.state.IState;

public class StoringData implements IState {

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
		// set the req button text
		GUI.reqDataButton.setText(" -*- ");
		GUI.debugOutView.setText(" Moving to the Processing Data state ");
		
		myApp.setState(new ProcessingData());
		
	}

	@Override
	public void dataRecieved(Car myApp, GUI myGui) {
		// TODO Auto-generated method stub

	}

	@Override
	public void timeEvent(Car myApp, GUI myGui) {
		// TODO Auto-generated method stub

	}

}

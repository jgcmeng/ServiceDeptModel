package com.application.states;

import com.application.context.Car;
import com.application.gui.GUI;
import com.application.state.IState;

public class SendingData implements IState {
	
	private int mySeconds = 0;

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
		// TODO Auto-generated method stub
		return "Will not work";
	}

	@Override
	public String dataRecieved(Car myApp, GUI myGui) {
		// TODO Auto-generated method stub
		myApp.setState(new NormalRunning());
		return "setting the Normal Running State";
	}

	@Override
	public void timeEvent(Car myApp, GUI myGui) {
		// TODO Auto-generated method stub
		mySeconds++;
		GUI.onDo3.setText(Integer.toString(mySeconds));
		
	}

}

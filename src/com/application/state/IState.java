package com.application.state;

import com.application.context.Car;
import com.application.gui.GUI;

public interface IState {
	void running(Car myApp, GUI myGui);
	void returnMessage(Car myApp, GUI myGui);
	
	//From the example
	void reqData(Car myApp,GUI myGui);
	void dataRecieved(Car myApp,GUI myGui);
	void timeEvent(Car myApp,GUI myGui);
}

package com.application.Timer;

import java.util.TimerTask;

import com.application.context.Car;

public final class Task extends TimerTask {
	
	private Car myCar;
	
	public Task(Car myCarIn){
		this.myCar = myCarIn;
	}
	
	@Override
	public void run() {
		// What do you want to do??
		this.myCar.timerEvent();

	}

}

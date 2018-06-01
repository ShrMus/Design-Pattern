package com.shrmus.demo02;

public class Computer {
	private Monitor monitor;
	
	public Computer(Monitor monitor) {
		this.setMonitor(monitor);
	}

	public Monitor getMonitor() {
		return monitor;
	}

	public void setMonitor(Monitor monitor) {
		this.monitor = monitor;
	}
}

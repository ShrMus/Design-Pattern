package com.shrmus.demo02;

public class Bird {
	private Wings wings;
	
	public Bird() {
		wings = new Wings();
	}

	public Wings getWings() {
		return wings;
	}

	public void setWings(Wings wings) {
		this.wings = wings;
	}
}

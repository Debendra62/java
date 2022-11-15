package com.Basic_java_class_20.loosecoupled;

public class Trip {

	private Vehicle vehicle;

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	
	public void tripStart() {
		vehicle.ignitionOn();
	}
	
}

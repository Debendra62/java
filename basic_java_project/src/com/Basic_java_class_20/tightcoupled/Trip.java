package com.Basic_java_class_20.tightcoupled;

public class Trip {

	Car car=new Car();
	Bike bike=new Bike();
	
	public void tripStart() {
		car.ignitionOn();
	}
	
	// public void tripStart() {
	//	bike.ignitionOn();
	// }
}

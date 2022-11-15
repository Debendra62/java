package com.Basic_java_class_20.loosecoupled;

public class LooseCoupledDemo {

	public static void main(String[] args) {
		
		Trip trip=new Trip();
		trip.setVehicle(new Bike());
		trip.tripStart();
	}
}

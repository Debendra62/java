package com.Basic_java_class_18;

public class MultipleInheritanceDemo implements RectangleArea,VolumeCuboid {

	private int area;
	private int volume;
	
	public void showVolume() {
		System.out.println("Volume: "+volume);
	}
	
	public void showArea() {
		System.out.println("Area: "+area);
	}
	
	public int volume(int h ) {
		volume=area*h;
	   return volume;
	}
	
	public int area(int l,int b) {
		area=l*b;
		return area;
	}
	
	public static void main(String[] args) {
		
		MultipleInheritanceDemo demo=new MultipleInheritanceDemo();
		demo.area(5,3);
		demo.volume(2);
		demo.showArea();
		demo.showVolume();
	}
}

package com.edu.over;

class VolumeOverloading{
	double volume(double r) {
        double vol = (4/3)*(22/7)*(r*r*r);
		return vol;
	}
	double volume(double h, double r) {
		double v=(22/7)*(r*r)*h;
		return v;
	}
	double volume(double l, double b, double h) {
		//double cv=l*b*h;
		return l*b*h;
	}
}

public class VolumeOfSphere {

	public static void main(String[] args) {
		VolumeOverloading vob=new VolumeOverloading();
		//double v=vol.volume(4);
		//System.out.println("Volume of a sphere is "+v);
		System.out.println("Volume of a sphere is "+vob.volume(4));
		System.out.println("Volume of cylinder is "+vob.volume(4, 8));
		System.out.println("Volume of cuboid is "+vob.volume(2, 8, 9));
	}

}

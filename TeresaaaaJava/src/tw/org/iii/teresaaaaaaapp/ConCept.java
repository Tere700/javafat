package tw.org.iii.teresaaaaaaapp;

import tw.org.iii.classes.Bike;

public class ConCept {

	public static void main(String[] args) {
		Bike b1 = new Bike();
		Bike b2 = new Bike();
		Bike b3 = b1;
		int[]a1= new int[2];
		double[]a2 =new double[2];
		boolean[]a3=new boolean[3];
		float[]a4 = new float[3];
		
		System.out.println("-----");
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
		System.out.println(b1 == b2);
		System.out.println(b1 == b3);
		

}}
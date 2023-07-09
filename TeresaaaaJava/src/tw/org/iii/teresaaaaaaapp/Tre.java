package tw.org.iii.teresaaaaaaapp;

import tw.org.iii.classes.Bike;
import tw.org.iii.classes.Scooter;

public class Tre {

	public static void main(String[] args) {

			Bike b1 = new Bike();
			Bike b2 = new Bike();
			System.out.println(b1.getColor());
			System.out.println(b1.getSpeed());
			System.out.println(b2.getSpeed());
			b1.upSpeed();b1.upSpeed();b1.upSpeed();b1.upSpeed();
			b2.upSpeed();b2.upSpeed();b2.upSpeed();b2.upSpeed();
			System.out.println(b1.getSpeed());
			System.out.println(b2.getSpeed());
			
			Scooter s1 = new Scooter();
			s1.upSpeed();s1.upSpeed();s1.upSpeed();s1.upSpeed();
			System.out.println(s1.getSpeed());
			
		}
}
package tw.org.iii.classes;

public class Scooter extends Bike {	
			@Override
			public void upSpeed() {
				speed = speed < 1? 1: speed*1.7;
			}
}
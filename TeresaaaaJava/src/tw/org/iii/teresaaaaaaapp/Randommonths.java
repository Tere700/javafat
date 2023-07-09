package tw.org.iii.teresaaaaaaapp;

public class Randommonths {
	public static void main(String[] args) {
		int month=(int)(Math.random()*12)+1;
		int days;
		switch(month) {
		case 1,3,5,7,8,10,12:
		days=31;
		break;
		case 4,6,9,11:
		days=30;
		break;
		case 2:
		days=28;
		break;
		default:
		days=0;
		System.out.println("x");
		break;
		}System.out.printf("%d月有%d天",month,days);
}
}
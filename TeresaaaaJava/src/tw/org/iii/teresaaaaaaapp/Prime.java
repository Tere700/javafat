package tw.org.iii.teresaaaaaaapp;

public class Prime {
	public static void main(String[] args) {

		int r=13;
		boolean isPrime = true;
		for(int i=2;i<r;i++) {
		if (r%i==0) {	
			isPrime = false;
			break;
		}
		}	System.out.printf("%d => %d", r, isPrime?1:0);
		
		
		}}

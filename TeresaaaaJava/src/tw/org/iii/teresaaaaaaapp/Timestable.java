package tw.org.iii.teresaaaaaaapp;

public class Timestable {
	public static void main(String[] args) {
		final int START=1;
		final int ROWS=3;
		final int COLS=3;
		
		for(int k=0;k<ROWS;k++) {
		for(int j=1;j<=9;j++ ) {
		for(int i=START; i<=(START+COLS-1); i++) { //起始值|幾個直行|
			int newi = i+k*COLS;
			int r=newi*j;
		System.out.printf("%d X %d = %d\t",newi,j,r);

	} System.out.println();
	} System.out.println("-------");
}
	}}

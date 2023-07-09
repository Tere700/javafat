package tw.org.iii.teresaaaaaaapp;

public class Increase {


		public static void main(String[] args) {
			int a=10, b=4;
			if (a++<=10 && b-->=3) {
				System.out.printf("OK: a = %d, b = %d\n", a, b);			
			}else {
				System.out.printf("NO: a = %d, b = %d\n", a, b);
			}if ( ++a <=10 && --b>=3) {
				System.out.printf("OK: a = %d, b = %d\n", a, b);		
			}else {
				System.out.printf("NO: a = %d, b = %d\n", a, b);
			}if( ++a <=10 || --b>=3) {
				System.out.printf("OK: a = %d, b = %d\n", a, b);
			}else {
				System.out.printf("NO: a = %d, b = %d\n", a, b);
			}if( ++a<=10 & --b>=3) {
				System.out.printf("OK: a = %d, b = %d\n", a, b);			
			}else {
				System.out.printf("NO: a = %d, b = %d\n", a, b);
			}if( ++a >=10 || --b>=3) {
				System.out.printf("OK: a = %d, b = %d\n", a, b);
			}else {
				System.out.printf("NO: a = %d, b = %d\n", a, b);
			}
			System.out.println(3 & 2);
			System.out.println(3 | 2);
			System.out.println(3 ^ 2); 
		}

	}

	 /*一般都顯示四位數 3轉成二進位11->0011,2轉成二進位10->0010
	  * &不同的取0  =0010
	  * |不同的取1  =0011
	  * ^不同的取1相同的取0  =0001
	*/

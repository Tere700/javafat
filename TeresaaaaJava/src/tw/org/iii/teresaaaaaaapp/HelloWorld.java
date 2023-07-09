package tw.org.iii.teresaaaaaaapp;

import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		
		int year=2000;
		
		if (year%4==0) {
			if (year%100==0) {
				if(year%400==0) {
					System.out.println("閏年"); //366
			} else {System.out.println("平年");
				//365
			}
		} else {System.out.println("閏年");
			//365
		}
		}else {System.out.println("平年");
		//365
		}
		}
}

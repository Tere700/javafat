package tw.org.iii.teresaaaaaaapp;

import java.util.Scanner;

public class Test8 {
	public static void main(String[] args) {
	 Scanner scanner = new Scanner (System.in);
	 System.out.println("請輸入年份");
	 int year = scanner.nextInt();
	 if (year % 4 == 0){
		 if (year % 100 == 0) {
			 if (year % 400 == 0) {
			System.out.println(year + "年為閏年");
			 }else {
				 System.out.println(year + "年為平年");
			 }
		 }else {
			 System.out.println(year + "年為閏年");
		 }
	 }else System.out.println(year + "年為平年");
	 
	if ((year%4==0 && year%100!=0)||year%400==0){
		 
	 }//邏輯與運算子 &&：如果第一個條件為假，則不會對第二個條件進行求值。
	 //邏輯或運算子 ||：如果第一個條件為真，則不會對第二個條件進行求值。
	
}
}
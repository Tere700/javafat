package tw.org.iii.teresaaaaaaapp;

import java.util.Scanner;

public class Test11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.println("輸入月份");
		int a = scanner.nextInt();
		switch(a) {
		case 1:
			System.out.printf("%d月有31天",a);
			break;
		case 2:
			System.out.printf("%d月有28天",a);
			break;
		case 3:
			System.out.printf("%d月有31天",a);
			break;
		case 4:
			System.out.printf("%d月有30天",a);
			break;
		case 5:
			System.out.printf("%d月有31天",a);
			break;
		case 6:
			System.out.printf("%d月有30天",a);
			break;
		case 7:
			System.out.printf("%d月有31天",a);
			break;
		case 8:
			System.out.printf("%d月有31天",a);
			break;
		case 9:
			System.out.printf("%d月有30天",a);
			break;
		case 10:
			System.out.printf("%d月有31天",a);
			break;
		case 11:
			System.out.printf("%d月有30天",a);
			break;
		case 12:
			System.out.printf("%d月有31天",a);
			break;
		default:
			System.out.printf("沒有%d月",a);
			break;
		}
		}
	
	}

package tw.org.iii.teresaaaaaaapp;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("X = ");
		int x = scanner.nextInt();
		System.out.print("y = ");
		int y = scanner.nextInt();
		int r1 = x + y;
		int r2 = x - y;
		int r3 = x * y;
		int r4 = x / y;
		int r5 = x % y;
		System.out.printf("相加結果:" + "%d + %d = %d\n", x, y , r1);
		System.out.printf("相減結果:" + "%d - %d = %d\n", x, y , r2);
		System.out.printf("相乘結果:" + "%d * %d = %d\n", x, y , r3);
		System.out.printf("相除結果(沒有餘數):" + "%d / %d = %d\n", x, y , r4);
		System.out.printf("相除結果(有餘數):" + "%d + %d = %d.....%d\n", x, y , r4, r5);

	}

}

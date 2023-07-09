package tw.org.iii.teresaaaaaaapp;

public class DiceV3 {

	public static void main(String[] args) {
				//int point;//宣告了一個名為point的變數，該變數的類型是整數。
				int point;//宣告了一個名為point的變數，該變數的類型是整數陣列。
				int[] p=new int[7];//物件初始化 使用new這個關鍵字
				
				for (int i=0; i<100; i++) {
					point = (int)(Math.random()*9)+1;	// 1 ~ 6

					if (point >=1 && point <=9) {
						p[point>=7 ? point-3 : point]++;
					}else {
						p[0]++;
					}
				}
				
				if (p[0] == 0) {
					for (int i=1; i<=6; i++) {
						System.out.printf("%d點出現%d次\n", i, p[i]);
					}
				}else {
					System.out.println("XX");
				}}}
				
package tw.org.iii.teresaaaaaaapp;

public class Test4 {

	public static void main(String[] args) {
		double temp1 = Math.random(); //0.0~1.0(不包含1.0的值)
		int score = (int) (temp1 * 100);
		System.out.println(score);
		int min = 2; // 最小值（包括）
		int max = 100; // 最大值（不包括）
		int temp = (int) (Math.random() * (max - min)) + min;
		System.out.println(temp);

		double temp2 = Math.random();
		int score1 = (int) (temp2 * 101);
		System.out.println(score1);

		if (score1 >= 60) {
			System.out.println("pass");
		} else {
			System.out.println("fail");
		}
		System.out.println("Game Over");

		int dice = (int) (Math.random() * 6) + 1;
		System.out.println(dice);

		double temp3 = Math.random();
		int score2 = (int) (temp3 * 101);
		System.out.println(score2);
		if (score2 >= 90) {
			System.out.printf("你的成績為 %d，級別：A", score2);
		} else if (score2 >= 80) {
			System.out.printf("你的成績為 %d，級別：B", score2);
		} else if (score2 >= 70) {
			System.out.printf("你的成績為 %d，級別：C", score2);
		} else if (score2 >= 60) {
			System.out.printf("你的成績為 %d，級別：D", score2);
		} else {
			System.out.printf("你的成績為 %d，級別：E", score2);
		}

	}
}

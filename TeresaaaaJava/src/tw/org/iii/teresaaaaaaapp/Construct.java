package tw.org.iii.teresaaaaaaapp;

public class Construct {

	public static void main(String[] args) {
		String s1 = "Tere2121";//""產生物件 //s1物件變數 //Tere2121內容
		System.out.println(s1.charAt(0));//從零開始起算
		System.out.println("Tere2121".charAt(0));
		System.out.println("Eric".charAt(0));
		String s2 = new String();//無傳參數建構式
		byte[] b1 = {97,98,99,100}; //11跟12列一模一樣 b1宣告同時元素初始化
		byte[] b2;
		b2 = new byte[]{97,98,99,100}; //ASCII
		String s3 = new String(b1);
		String s4 = new String(b1,1,2);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
	}

}

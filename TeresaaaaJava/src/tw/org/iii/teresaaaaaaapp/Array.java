package tw.org.iii.teresaaaaaaapp;

public class Array {

	public static void main(String[] args) {
		int[]a; //byte,short,int,long,float,double,boolean,char 基本型別
		a= new int[3]; //[int>0] 除了基本型別之外等等通是物件
		boolean[]b=new boolean[4];//物件初始化 使用new這個關鍵字
		System.out.println(a.length);
		System.out.println(b.length);
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(b[0]);

		a[1]=125;
		a[0]=123;
		a[2]=12;
		for(int i=0;i<a.length;i++) { //符合條件才執行 跑回圈
			System.out.println(a[i]);
		}
		System.out.println("------");
		for (int v:a) { //for-each跑全部元素
			System.out.println(v);
		}
	}

}

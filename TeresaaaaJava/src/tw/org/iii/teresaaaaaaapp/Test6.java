package tw.org.iii.teresaaaaaaapp;

public class Test6 {

	public static void main(String[] args) {
		Tere01 t1 = new Tere01("A");
		Tere01 t2 = new Tere01("B");
		t1.start();
		t2.start();
		System.out.println("Brad");
}
}
class Tere01 extends Thread{
	private String name;
	Tere01(String name){this.name=name;}
	@Override
	public void run() {
		for(int i=0;i<20;i++) {
			System.out.println(name + ":" + i);
		try {
			Thread.sleep(10);
		}catch(InterruptedException e) {
			
		}
		}
	}
}
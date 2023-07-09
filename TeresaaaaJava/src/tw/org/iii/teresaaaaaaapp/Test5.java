package tw.org.iii.teresaaaaaaapp;

public class Test5 {
	public static void main(String[] args) {
		Brad561 b1 = new Brad561("A");
		Brad561 b2 = new Brad561("B");
		b1.start();
		b2.start();
		System.out.println("Brad");
		
	}
}
class Brad561 extends Thread{
	private String name;
	Brad561(String name){this.name = name;}
	@Override
	public void run() {
		for (int i=0; i<20; i++) {
			System.out.println(name + ":" +i);
			try {
				Thread.sleep(200);
			}catch(InterruptedException e) {
				
			}
		}
	}
}


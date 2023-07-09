package Exception.ee;

import java.util.Scanner;

public class Main{
	  
    public static void main(String[] args) throws InterruptedException{  

    	MyThread thread1 = new MyThread();
    	MyRunnable runnable = new MyRunnable();
    	Thread thread2 = new Thread(runnable);
    	
       	thread1.start();
       	thread2.start();
    }
} 
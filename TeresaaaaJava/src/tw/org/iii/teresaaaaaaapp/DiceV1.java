package tw.org.iii.teresaaaaaaapp;

public class DiceV1 {

	public static void main(String[] args) {
		int p0,p1,p2,p3,p4,p5,p6,point;
			p0=p1=p2=p3=p4=p5=p6=0;
			 
			for(int i=0;i<=100;i++) {
				point=(int)(Math.random()*6)+1;
			switch(point) {
				case 1:p1+=1;break;
				case 2:p2+=1;break;
				case 3:p3+=1;break;
				case 4:p4+=1;break;
				case 5:p5+=1;break;
				case 6:p6+=1;break;
				default: p0+=1;
			}
			}if(p0==0) {
				System.out.printf("1點出現%d次\n",p1);
				System.out.printf("2點出現%d次\n",p2);
				System.out.printf("3點出現%d次\n",p3);
				System.out.printf("4點出現%d次\n",p4);
				System.out.printf("5點出現%d次\n",p5);
				System.out.printf("6點出現%d次\n",p6);
			}else {System.out.println("XX");}
	}

}
package tw.org.iii.teresaaaaapp;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JLabel;

public class myClock extends JLabel{
	
	private Timer timer; 
	
	public myClock(){
		timer = new Timer();
		timer.schedule(new Clocktask(), 0, 1000);
		
//		Calendar cal = Calendar.getInstance();
//		int year = cal.get(Calendar.YEAR);
//		int month = cal.get(Calendar.MONTH)+1;
//		int day = cal.get(Calendar.DAY_OF_MONTH);
//		setText(String.format("%04%d-%02%d-%02%d",year, month, day));
//		setText(sdf.format(now));
	
	}
	
	private class Clocktask extends TimerTask{
		@Override
		public void run() {
			Date now = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			setText(sdf.format(now));
			
		}
	}
}
	
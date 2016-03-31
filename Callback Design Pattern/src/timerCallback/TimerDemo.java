package timerCallback;

import javax.swing.Timer;

public class TimerDemo 
{
	public static void main(String[] args)
	{
		TimePrinter tp = new TimePrinter();
		Timer t = new Timer(1000, tp);
		t.start();
	}
}

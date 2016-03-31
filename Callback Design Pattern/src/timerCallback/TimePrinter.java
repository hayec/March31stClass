package timerCallback;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
public class TimePrinter implements ActionListener 
{
	@Override
	public void actionPerformed(ActionEvent arg0)
	{
		Date now = new Date();
		System.out.println("At the the tone, the time is : " + now.getTime());
		Toolkit.getDefaultToolkit().beep();
		
	}
}

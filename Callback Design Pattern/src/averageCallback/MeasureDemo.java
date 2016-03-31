package averageCallback;

import java.awt.Rectangle;

public class MeasureDemo 
{	
	public static void main(String[] args)
	{
		IMeasure areaMeas = new AreaMeasurer();
		Rectangle[] rects = new Rectangle[]
				{
				new Rectangle(5, 10, 20, 30),
				new Rectangle(30, 20, 10, 5),
				new Rectangle(1, 2, 4, 4)
				};
		double averageArea = Data.average(rects, areaMeas);
		System.out.println("Average Area : " + (int) averageArea);
		System.out.println("Expected : " + 222);
	}

}

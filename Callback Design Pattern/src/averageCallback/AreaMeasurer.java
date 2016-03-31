package averageCallback;

import java.awt.Rectangle;

public class AreaMeasurer implements IMeasure 
{
	@Override
	public double measure(Object object)
	{
		Rectangle aRectangle = (Rectangle) object;
		double area =  aRectangle.getWidth() * aRectangle.getHeight();
		return area;
	}
}

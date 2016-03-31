package averageCallback;

public class Data 
{
	public static double average(Object[] objects, IMeasure measure)
	{
		double sum = 0;
		for(Object o : objects)
		{
			sum += measure.measure(o);
		}
		if(objects.length > 0)
			return sum / objects.length;
		else
			return 0;
	}
}

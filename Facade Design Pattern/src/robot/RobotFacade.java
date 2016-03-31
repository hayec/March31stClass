package robot;

public class RobotFacade 
{
	private RobotColor color;
	private RobotMetal metal;
	private RobotBody body;
	
	RobotFacade()
	{
		color = new RobotColor();
		metal = new RobotMetal();
		body = new RobotBody();
	}
	public void constructRobot(String c, String b, String m)
	{
		System.out.println("\nStarting Creation of the Robot ... ");
		metal.setMetal(m);
		body.setBody(b);
		color.setColor(c);
		System.out.println("Robot Created.");
	}
}

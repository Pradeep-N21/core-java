public class Fan
{
	Fan()
	{
		System.out.println( "No-Parameter Constructor of Fan class");
	}
	Fan( float number)
	{
		System.out.println( "Parameterized Constructor of Fan class");
		System.out.println(number);
	}
	public static void main(String[] args)
	{
		new Fan();
		new Fan(4.4f);
	}
}
public class Remote
{
	Remote()
	{
		System.out.println( "No-Parameter Constructor of Remote class");
	}
	Remote( boolean boolValue)
	{
		System.out.println( "Parameterized Constructor of Remote class");
		System.out.println(boolValue);
	}
	public static void main(String[] args)
	{
		new Remote();
		new Remote(true);
	}
}
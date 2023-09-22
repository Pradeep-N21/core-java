public class Paint
{
	Paint()
	{
		System.out.println( "No-Parameter Constructor of Paint class");
	}
	Paint( String name)
	{
		System.out.println( "Parameterized Constructor of Paint class");
		System.out.println(name);
	}
	public static void main(String[] args)
	{
		new Paint();
		new Paint("Pradeep");
	}
}
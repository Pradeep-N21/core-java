public class Light
{
	Light()
	{
		System.out.println( "No-Parameter Constructor of Light class");
	}
	Light( int number)
	{
		System.out.println( "No-Parameter Constructor of Light class");
		System.out.println(number);
	}
	public static void main(String[] args)
	{
		new Light();
		new Light(4);
	}
}
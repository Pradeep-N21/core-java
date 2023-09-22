public class Bag
{
	Bag()
	{
		System.out.println( "No-Parameter Constructor of Bag class");
	}
	Bag( char charvalue)
	{
		System.out.println( "Parameterized Constructor of Bag class");
		System.out.println(charvalue);
	}
	public static void main(String[] args)
	{
		new Bag();
		new Bag('P');
	}
}
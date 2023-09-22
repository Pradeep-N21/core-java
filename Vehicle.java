public class Vehicle
{
	public static void main(String[] args)
	{
		attendence(87);
		checknumber(-5);
		comparison(34,65);
		car("bike");
		checkEven(55);
		
	}
	static void attendence(int percent)
	{
		if(percent>=75)
		{
			System.out.println("Eligible for Exam");
		}
		else
		{
			System.out.println("Not Eligible for Exam");
		}
	}
	static void checknumber(int number)
	{
		if (number > 0) 
		{
            System.out.println("The number is positive.");
        } 
        else if (number < 0)
		{
            System.out.println("The number is negative.");
        } 
		else
		{
            System.out.println("The number is zero.");
        }
	}
	static void comparison(int firstVal, int secondVal)
	{
		if (firstVal > secondVal) 
		{
            System.out.println("firstValue is greater than secondValue.");
        } 
		else if (firstVal < secondVal) 
		{
            System.out.println("firstValue is less than secondValue.");
        } 
		else
	    {
            System.out.println("firstValue and secondVal are equalue.");
        }
	}
    static void car(String vehicleType)
	{
		if(vehicleType== "Car")
		{
			System.out.println("Vehicle is Car");
		}
		else
		{
			System.out.println("Vehicle is Not Car");
		}
	}
    static void checkEven( int num)
	{
		if(num % 2 == 0 )
		{
			System.out.println("Number is Even");
		}
		else
		{
			System.out.println("Number is Odd");
		}
	}
}
			
			
	
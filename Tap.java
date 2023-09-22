import java.util.*;
import java.lang.*;
import java.io.*;
public class Tap
{
    public static void main(String[] args)
    {
        int ReturnedValue1=divide(35,7,3);
        System.out.println(ReturnedValue1);

        int ReturnedValue2=divide(35,7);
        System.out.println(ReturnedValue2);

        int ReturnedValue3=divide(35);
        System.out.println(ReturnedValue3);

        charge(5.5f);
         charge(false);
        charge("Invoking");
       
        open(10,10.5f);
        open(20.2f,40);
           
     }
    static int divide(int firstValue,int secondValue,int thirdValue)
    {
        System.out.println("method with 3 parameters");
        int dividedValue=firstValue / secondValue /thirdValue;
        return dividedValue;
    } 
    static int divide(int firstValue,int secondValue)
    {
        System.out.println("method with 2 parameters");
        int dividedValue=firstValue/secondValue;
        return dividedValue;
    } 
    static int divide(int firstValue)
    {
        System.out.println("method with 1 parameters");
        return firstValue;
    } 

    static void charge(float firstValue)
    {
        System.out.println("method having float type parameters");
        System.out.println(firstValue);
    }
    static void charge(boolean firstValue)
    {
        System.out.println("method having boolean type parameters");
        System.out.println(firstValue);
    }
    static void charge(String firstValue)
    {
        System.out.println("method having String type parameters");
        System.out.println(firstValue);
    }
    
    static void open(int firstValue,float secondValue)
    {
        System.out.println(firstValue+" "+secondValue);
    }
    static void open(float secondValue,int firstValue)
    {
        System.out.println(secondValue+" "+firstValue);
    }

    
}
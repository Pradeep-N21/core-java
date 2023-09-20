import java.util.*;
import java.io.*;
import java.lang.*;

public class MethodEx
{
    public static void main(String[] args)
    {
            work();
            run();
            int addition  = add();
            System.out.println(addition);
            float diff = sub();
             System.out.println(diff);
             long result= mul();
             System.out.println(result);
             boolean b=checkeven();
             System.out.println(b);
             String s=msg();
             System.out.println(s);
             char c=Show();
            System.out.println(c);
            short t=multiply();
            System.out.println(t);
            double d=division();
            System.out.println(d);


    }
    public static void work(){
        System.out.println("person is working");
    }
     public static void run(){
        System.out.println("person is running");
    }
    public static int add()
{
    int a=10;
    int b=20;
    int c= a+b;
    return c;
}
public static float sub()
{
    float a=10.5f;
    float b=5.3f;
    float c= a-b;
    return c;
}
public static long mul()
{
    long a=10L;
    long b=5L;
    long c= a*b;
    return c;
}
public static boolean checkeven()
{
    int num=10;
    if(num % 2 == 0)
    {
        return true;
    }
    else
    {
        return false;
    }
}
public static String msg()
{
    String name= "pradee";
    return name;
}
public static char Show()
{
char a='Z';
return a;
}
public static short multiply()
{
short a=100;
return a;
}
public static double division()
{
double a=2.5;
double b=1.2;
double c=a/b;
return c;
}

}

    
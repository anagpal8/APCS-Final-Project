import java.util.*;

public class Calculator
{

    public Calculator ()
    {

    }

    public int add (int a, int b)
    {
        return a + b;
    }

    public int subtract (int a, int b)
    {
        return a-b;
    }

    public int multiply (int a, int b)
    {
        return a*b;
    }

    public double divide (double a, double b)
    {
        return a/b;
    }

    public int square(int a)
    {
        return a*a;
    }

    public double squareRoot(double a)
    {
        return Math.sqrt(a);
    }
    
    public int abs(int a)
    {
        return Math.abs(a);
    }

    public String convertToBase(int num, int base)
    {
        String converted = "";

        converted += "" + num%base;
        num= num/base;
        while (num > 1)
        {
            converted+= "" + num%base;
            num = num/base;

        }
        converted += "1";

        String result = new StringBuffer(converted).reverse().toString();
        return result;
    }

}
    


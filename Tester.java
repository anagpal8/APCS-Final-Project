import java.util.*;
public class Tester
{
    
    public static void main (String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is the problem you are trying to solve? ");
        String expression = sc.nextLine();
        StringCalc c1 = new StringCalc(expression);
        System.out.print(c1.operations());


        
    }
}
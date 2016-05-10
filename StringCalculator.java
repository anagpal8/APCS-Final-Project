import java.util.*;
public class StringCalculator extends Calculator
{
    public static void main (String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is the problem you are trying to solve? ");
        String expression = sc.nextLine();
        ArrayList<String> values = new ArrayList<String>();
        for (int i =0; i<expression.length(); i++)
        {
            values.add(expression.substring(i, i+1));
        }
        
        
        
    }
    
}

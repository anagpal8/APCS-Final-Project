import java.util.*;
public class StringAnalyzer
{
    private String string1;
    private int priority;
    ArrayList<String> values = new ArrayList<String>();
    
    
 
    public StringAnalyzer (String s)
    {
        string1 = s;

    }

    public boolean containsMultiply()
    {
        //boolean multiply = false;
        //ArrayList<String> values = new ArrayList<String>();
        if (string1.indexOf("*") == -1)
        {
            return false;
        }
        return true;
              
        /*boolean answer = false;
        for (int i =0; i<string1.length(); i++)
        {
            if (string1.substring(i, i+1).equals("*"))
            {
                answer = true;
            }
        } 
        */
        //return answer;
        /*for (int i =0; i < values.size(); i++)
        {
            if (values.get(i) == "*")
            {
                priority = 1;
                return true;
            }
            
        }
        */

        
    }
    public boolean containsDivide()
    {
        //boolean divide = false;
        //ArrayList<String> values = new ArrayList<String>();
        if (string1.indexOf("/") == -1)
        {
            return false;
        }
        return true;
    }
    public boolean containsAdd()
    {
        if (string1.indexOf("+") == -1)
        {
            return false;
        }
        return true;
    }
    public boolean containsSubtract()
    {
        if (string1.indexOf("-") == -1)
        {
            return false;
        }
        return true;
    }
    public boolean isDecimal()
    {
        if (string1.indexOf(".") == -1)
        {
            return false;
        }
        return true;
    }
    public int Decimal()
    {
        return string1.indexOf(".");
    }
    public int length()
    {
        return string1.length();
    }

}

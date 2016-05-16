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
        for (int i =0; i<string1.length(); i++)
        {
            values.add(string1.substring(i, i+1));
        } 
        
        for (int i =0; i < values.size(); i++)
        {
            if (values.get(i) == "/")
            {
                priority = 1;
                return true;
            }
            
        }

        return false;
    }
    public boolean containsAdd()
    {
        //boolean add = false;
        //ArrayList<String> values = new ArrayList<String>();
        for (int i =0; i<string1.length(); i++)
        {
            values.add(string1.substring(i, i+1));
        } 
        
        for (int i =0; i < values.size(); i++)
        {
            if (values.get(i) == "+")
            {
                priority = 1;
                return true;
            }
            
        }

        return false;
    }
    public boolean containsSubtract()
    {
        //boolean subtract = false;
        //ArrayList<String> values = new ArrayList<String>();
        for (int i =0; i<string1.length(); i++)
        {
            values.add(string1.substring(i, i+1));
        } 
        
        for (int i =0; i < values.size(); i++)
        {
            if (values.get(i) == "-")
            {
                priority = 1;
                return true;
            }
            
        }

        return false;
    }
    public int getPriority()
    {
        return priority;
    }

}

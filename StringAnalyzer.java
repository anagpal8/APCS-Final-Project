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
        for (int i =0; i<string1.length(); i++)
        {
            values.add(string1.substring(i, i+1));
        } 
        
        for (int i =0; i < values.size(); i++)
        {
            if (values.get(i) == "*")
            {
                priority = 1;
                return true;
            }
            
        }

        return null;
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

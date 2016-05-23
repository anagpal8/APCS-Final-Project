import java.util.*;

public class StringCalc
{ 
    String expression;
    public StringCalc(String ex1)
    {
        expression = ex1;
        
    }
    
    public String operations()
    {
        

        StringAnalyzer s1 = new StringAnalyzer(expression);
        ArrayList<String> values = new ArrayList<String>();

        for (int i =0; i<expression.length(); i++)
        {
            values.add(expression.substring(i, i+1));
        }

        while(s1.containsMultiply() || s1.containsDivide())
        {
            for (int i = 0; i < values.size(); i++)
            {
                if (values.get(i).equals("*"))
                {
                    values.set(i, "" + (Double.parseDouble(values.get(i+1)) * Double.parseDouble(values.get(i-1))));
                    values.remove(i-1);
                    values.remove(i);
                    i = 0;
                    expression = "";
                    for (String c: values)
                    {
                        expression+=c;
                    }
                    s1 = new StringAnalyzer(expression);

                }
                else if (values.get(i).equals("/"))
                {
                    values.set(i, "" + (Double.parseDouble(values.get(i-1)) / Double.parseDouble(values.get(i+1))));
                    values.remove(i-1);
                    values.remove(i);
                    i = 0;

                    expression = "";
                    for (String c: values)
                    {
                        expression+=c;
                    }
                    s1 = new StringAnalyzer(expression);

                }
            }

            
            //System.out.println(values.get(0));

        }
        //System.out.println(values.get(0));

        while (s1.containsAdd() == true || s1.containsSubtract() == true)
        {
            for (int i = 0; i < values.size(); i++)
            {
                if (values.get(i).equals("+"))
                {
                    values.set(i, "" + (Double.parseDouble(values.get(i+1)) + Double.parseDouble(values.get(i-1))));
                    values.remove(i-1);
                    values.remove(i);
                    i = 0;
                    expression = "";
                    for (String c: values)
                    {
                        expression+=c;
                    }
                    s1 = new StringAnalyzer(expression);

                }
                else if (values.get(i).equals("-"))
                {
                    values.set(i, "" + (Double.parseDouble(values.get(i-1)) - Double.parseDouble(values.get(i+1))));
                    values.remove(i-1);
                    values.remove(i);
                    i = 0;
                    expression = "";
                    for (String c: values)
                    {
                        expression+=c;
                    }
                    s1 = new StringAnalyzer(expression);

                }
            }
            
        }
        return(values.get(0));
    }
}

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

        for (int i = 0; i < values.size(); i++)
        {
            if (values.get(i).equals("."))
            {
                values.set(i, "" + values.get(i-1) + "." + values.get(i+1));
                values.remove(i-1);
                values.remove(i);
                i=i-2;

            }
        }
        if (!(s1.containsMultiply() || s1.containsDivide() || s1.containsAdd() || s1.containsSubtract()))
        {
            return expression;
        }
        int x = 1;
        String expression2 = "";
        int ctr = 0;
        while (!(values.get(x-1).equals( "*")) && x<values.size())//, "/", "+", "-")
        {
            expression2+=values.get(x-1);
            x++;
            ctr++;
        }
        values.set(x-ctr, expression2);

        
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

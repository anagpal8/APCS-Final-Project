import java.util.*;
import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;

public class StringCalc
{ 

    public StringCalc()
    {
   
    }
    /**
     * @param the string expression from JFram
     * @return the calculated number
     * calculates the operation converts the string to numbers
     * */
    public String operations(String expression)
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

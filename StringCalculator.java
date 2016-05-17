import java.util.*;
public class StringCalculator extends Calculator
{
    public static void main (String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is the problem you are trying to solve? ");
        String expression = sc.nextLine();

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
                    values.set(i, "" + (Integer.parseInt(values.get(i+1)) * Integer.parseInt(values.get(i-1))));
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
                    values.set(i, "" + (Integer.parseInt(values.get(i+1)) / Integer.parseInt(values.get(i-1))));
                    values.remove(i-1);
                    values.remove(i);
                    i = 0;
                    System.out.println(values.get(0));
                    expression = "";
                    for (String c: values)
                    {
                        expression+=c;
                    }
                    s1 = new StringAnalyzer(expression);

                }
            }
            

            /*else if (values.get(i) == "/")
            {
            values.set(i, "" + (Integer.parseInt(values.get(i+1)) / Integer.parseInt(values.get(i-1))));
            values.remove(i-1);
            values.remove(i);
            i = i-2;

            }
            }
             */
            System.out.println(values.get(0));
            
        }
        //System.out.println(values.get(0));

        while (s1.containsAdd() == true || s1.containsSubtract() == true)
        {
            for (int i = 0; i < values.size(); i++)
            {
                if (values.get(i) == "+")
                {
                    values.set(i, "" + (Integer.parseInt(values.get(i+1)) + Integer.parseInt(values.get(i-1))));
                    values.remove(i-1);
                    values.remove(i);
                    i = i-2;
                }
                else if (values.get(i) == "-")
                {
                    values.set(i, "" + (Integer.parseInt(values.get(i+1)) - Integer.parseInt(values.get(i-1))));
                    values.remove(i-1);
                    values.remove(i);
                    i = i-2;

                }
            }

        }
        //String value = "";
        /*for (int i = 0; i < values.size(); i++)
        {
        value+=values.get(i);
        }
        /*ArrayList<String> values = new ArrayList<String>();
        for (int i =0; i<expression.length(); i++)
        {
        values.add(expression.substring(i, i+1));
        }
        for (int i =0; i < values.size(); i+=)
        {
        if (values.get(i) == "*")
        {
        values.set(i, "" + values.get(i-1) * values.get(i+1);
        i = i-3;
        }
        else if (values.get(i) == ("/")
        {

        }

        }
         */

        //System.out.println(value);
    }

}

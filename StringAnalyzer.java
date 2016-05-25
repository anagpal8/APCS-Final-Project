import java.util.*;
public class StringAnalyzer
{
    private String string1;

    ArrayList<String> values = new ArrayList<String>();

    public StringAnalyzer (String s)
    /**
     * @param takes in a string as part of the constructor
     * @creates a StringAnalyzer

     */
    {
        string1 = s;

    }

    public boolean containsMultiply()
    /**
     * @param none
     * @returns true or false depending on whether or not it has multiplication
     * method sends output to the functions in StringCalc
     */
    {

        if (string1.indexOf("*") == -1)
        {
            return false;
        }
        return true;


    }

    public boolean containsDivide()
    {
        /**
         * @param none
         * @returns true or false depending on whether or not it has division
         * method sends output to the functions in StringCalc
         */

        if (string1.indexOf("/") == -1)
        {
            return false;
        }
        return true;
    }

    public boolean containsAdd()
    {
        /**
         * @param none
         * @returns true or false depending on whether or not it has addition
         * method sends output to the functions in StringCalc
         */
        if (string1.indexOf("+") == -1)
        {
            return false;
        }
        return true;
    }

    public boolean containsSubtract()
    {
        /**
         * @param none
         * @returns true or false depending on whether or not it has subtraction
         * method sends output to the functions in StringCalc
         */
        if (string1.indexOf("-") == -1)
        {
            return false;
        }
        return true;
    }

    public boolean isDecimal()
    {
        /**
         * @param none
         * @returns true or false depending on whether or not it has a decimal
         * method sends output to the functions in StringCalc
         */
        if (string1.indexOf(".") == -1)
        {
            return false;
        }
        return true;
    }

    public int Decimal()
    /**
     * returns the location of where the decimal is in the function
     * sends this to StringCalc
     */
    {
        return string1.indexOf(".");
    }


}


public class BaseConversions
{

    public BaseConversions()
    {

    }

    /**
     * @param number from the answerOutput of the 
     * @return a binary String
     * method sends the output to another class to calculate binary
     */
    public String conBaseThru(int num)
    {
        return convertBaseTwo(num);
    }
    /**
     * @param number from the conBaseThru
     * @return is recursive 
     * converts the number to binary 
     */
    public String convertBaseTwo(int number)
    {

        if((number / 2) == 0) 
        {
            return Integer.toString(number % 2);      
        }
        else
        {
            return convertBaseTwo(number / 2) + Integer.toString(number % 2);
        }            
    }
    /**
     * @param number from the answerOutput of the JFrame
     * @return hex version of number
     *  converts num to hexadecimal
     */
    public String convertHex(int number)
    {
        String str = Integer.toHexString(number);
        return str; 
    }
    
}

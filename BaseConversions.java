
public class BaseConversions
{

    public BaseConversions()
    {

    }

    /**
     * @param number from the answerOutput of the 
     * @return void
     * method sends the output to another class to calculate binary
     */
    public String conBaseThru(int num)
    {
        return convertBaseTwo(num);
    }
    
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
    
    public String convertHex(int number)
    {
        String str = Integer.toHexString(number);
        return str; 
    }
    
}

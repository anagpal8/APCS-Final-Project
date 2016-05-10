
public class Conversions
{
    private int x; 
    public Conversions()
    {
        x = 0;
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

package coe318.lab6;
import java.util.ArrayList;
/**
 * Muhammad Ozair
 * 500763463
 */
public class Circuit 
{
    private static Circuit instance = null;
    private ArrayList <Resistor> resistors;
    
    public static Circuit getInstance()
    {
        if (instance == null)
        {
            instance = new Circuit();
        }
        return instance;
    }
    
    private Circuit()
    {
        this.resistors = new ArrayList <Resistor> ();      
    } //Yes, the constructor ia PRIVATE!
    
    public void add(Resistor re)
    {
        this.resistors.add(re);
    }
     @Override
    public String toString() 
    {
        String st = "";
        
        for (int i = 0; i < this.resistors.size(); i=i+1)
        {
        st = st + this.resistors.get(i).toString() + "\n";
        }
         return st;
    }   
}

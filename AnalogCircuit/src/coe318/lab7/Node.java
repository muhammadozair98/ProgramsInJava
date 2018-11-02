package coe318.lab7;
/**
 *
 * Muhammad Ozair 500763463 Section: 071
 */
public class Node 
{
     int location;
     static int nnodes = -1;
    
    public Node()
    {
        location = ++ nnodes;
    }
    
   @Override
    public String toString()
    {
        String str="";
        str = str + location;     
        return str;
    }
}

package coe318.lab6;
/**
 * Muhammad Ozair
 * 500763463
 */
public class Resistor 
{
    public int resistance, resI;
    public static int resC = 0;
    public Node node1,node2;
    
    public Resistor(int resistance, Node node1, Node node2)
    {
        if (resistance<0)
        {
            throw new IllegalArgumentException("Resistance can't be negative.");
        }
        if (node1==null || node2==null)
        {
            throw new IllegalArgumentException("One or more nodes don't exist. Both nodes can't be null.");
        }
        this.node1 = node1;
        this.node2 = node2;
        this.resistance = resistance;
        this.resI = resC;
        resC = resC + 1;
    }
    public Node [] getNodes()
    {
        Node [] nodes = {node1, node2};
        return nodes;
    }
    @Override
    public String toString() 
    {
      return("R"+ resI + " " + node1 + " " + node2 + " " + resistance);
    }
}

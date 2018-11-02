package coe318.lab7;
/**
 *
 * Muhammad Ozair 500763463 Section: 071
 */
public class Resistor extends Elements 
{
    private double res;
    Node n1;
    Node n2;
    private int ri;
    private static int num_r;
    public Resistor(Node node1, Node node2, double resistance)
    {
        if(resistance < 0)
        {
            throw new IllegalArgumentException("The resistance value cannot be negative.");
        }
        if(node1 == null || node2 == null || (node1 == node2))
        {
            throw new IllegalArgumentException("The resistor is not connected at either nodes."); 
        }
        if(node1.location < 0 || node2.location < 0)
        {
            throw new IllegalArgumentException("The node assignment must be positive.");
        }
        else
        {
            res = resistance;
            n1 = node1;
            n2 = node2;
            ri = ++num_r;   
        }  
    }
    public Node[] getNodes()
    {
        Node[] nodes = new Node[2];
        nodes[0] = n1;
        nodes[1] = n2;
        return nodes;    
    }
   @Override
    public String toString()
    {
        String s = "";
        Node[] n = getNodes();
        if(n[0].location>n[1].location)
        {
            return s + "R" + ri + " " + n[1] + " " + n[0]+ " " + res;
        }
        else
        {
            return s + "R" + ri + " " + n[0]+ " " + n[1] + " " + res;
        }
    }
}

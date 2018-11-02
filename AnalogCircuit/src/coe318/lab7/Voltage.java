package coe318.lab7;
/**
 *
 * Muhammad Ozair 500763463 Section: 071
 */
public class Voltage extends Elements
{
    Node n1;
    Node n2;
    double volt;
    int vnum;
    static int count = 0;
    public Voltage(Node node1, Node node2, double voltage)
    {
        if(node1 == null || node2 == null || (node1 == node2))
        {
            throw new IllegalArgumentException("The voltage source is not connected at either nodes.");
        }
        if(node1.location < 0 || node2.location < 0)
        {
            throw new IllegalArgumentException("The node assignment must be positive.");
        }
        else
        {
            count = count + 1;
            n1 = node1;
            n2 = node2;
            volt = voltage;
            vnum = count;
        }
    }
    public boolean isNegative()
    {
        Node[] n = getNodes();
        return n[0].location>n[1].location;
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
    
        if(isNegative())
        {
            return s + "V" + vnum + " " + n[1] + " " + n[0] + " " + "DC" + " " + (-volt);
        }
        else
        {
            return s + "V" + vnum + " " + n[0] + " " + n[1] + " " + "DC" + " " + volt;
        }
    } 
}

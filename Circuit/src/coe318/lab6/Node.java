package coe318.lab6;
/**
 * Muhammad Ozair
 * 500763463
 */
public class Node 
{
    private int nodeI;
    private static int nodeC = 0;

public Node() 
{
    this.nodeI = nodeC;
    nodeC = nodeC + 1;
}

    @Override
    public String toString() 
    {
        return("" + this.nodeI);
    }
} 

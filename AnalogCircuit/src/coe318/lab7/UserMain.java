package coe318.lab7;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * Muhammad Ozair 500763463 Section: 071
 */
public class UserMain implements UserInterface 
{
    String sin;
    ArrayList<Elements> cirelement = new ArrayList<>();
    Scanner userin = new Scanner(System.in);
    @Override
    public void start()
    {
        display();
        run();     
    }
    @Override
    public void run()
    {
        boolean run= true;
        while(run)
        {
            sin = userin.nextLine();
            if(sin.equals("END")||sin.equals("end"))
            {
                end();
                break;
            }
            else
                if(sin.equals("SPICE")||sin.equals("spice"))
                {
                    spice();
                }
            else
            {
                if(sin.startsWith("V") || sin.startsWith("v"))
                {
                    String delim = "[ ]+";
                    String[] value = sin.split(delim);
                    if(value.length > 4)
                    {
                        System.out.println("Incorrect Syntax");
                    }
                    else
                    {
                        Node node1 = new Node();
                        node1.location = Integer.parseInt(value[1]);
                        Node node2 = new Node();
                        node2.location = Integer.parseInt(value[2]);
                        Voltage v = new Voltage(node1,node2,Double.parseDouble(value[3]));
                        cirelement.add(v);
                    }
                }
                else{
                    if(sin.startsWith("r")||sin.startsWith("R"))
                    {
                        String delim="[ ]+";
                        String[] value = sin.split(delim);
                        if(value.length > 4)
                        {
                            System.out.println("Incorrect Syntax");
                        }
                        else
                        {
                            Node node1=new Node();
                            node1.location=Integer.parseInt(value[1]);
                            Node node2=new Node();
                            node2.location=Integer.parseInt(value[2]);
                            Resistor r= new Resistor(node1, node2, Double.parseDouble(value[3]));
                            cirelement.add(r);
                        }
                    }
                }    
            }   
        }
    }
    public static void main(String[] args) 
    {
        UserMain user= new UserMain();
        user.start();
    }
    @Override
    public void display()
    {
        System.out.println("Java: Simple Resistive Circuits");
        
        for(int i=0; i<10; ++i)
        {
            System.out.print("-");
        }
        
        System.out.println("Enter a Circuit element(Type(R/V), Location between two nodes, Value)");
        System.out.println("For Example: R 1 2 470.0");
    }
    @Override
    public void spice()
    {
        for(Elements c:cirelement)
        {
            System.out.println(c);
        }
    }
    @Override
    public void end()
    {
        System.out.println("All Done");
    }
    
}
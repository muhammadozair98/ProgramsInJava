package coe318.lab6;
/**
 * Muhammad Ozair
 * 500763463
 */
public class MainCircuit 
{
    public static void main(String[] args)
    {
        Node A = new Node(); // Node 0
        Node B = new Node(); // Node 1
        Node C = new Node(); // Node 2
        Node D = new Node(); // Node 3
        Node E = new Node(); // Node 4
        Node F = new Node(); // Node 5
        Node G = new Node(); // Node 6
        Node H = new Node(); // Node 7
        Node I = new Node(); // Node 8
        Node J = new Node(); // Node 9
        Node K = new Node(); // Node 10
        Node L = new Node(); // Node 11
        Node M = new Node(); // Node 12
      
         Resistor r0 = new Resistor(0,A,B);      // id is 0
         Resistor r1 = new Resistor(5,B,C);      // id is 1
         Resistor r2 = new Resistor(10,C,D);     // id is 2
         Resistor r3 = new Resistor(15,D,E);     // id is 3
         Resistor r4 = new Resistor(20,E,F);     // id is 4
         Resistor r5 = new Resistor(25,F,G);     // id is 5
         Resistor r6 = new Resistor(30,G,H);     // id is 6
         Resistor r7 = new Resistor(35,H,I);     // id is 7
         Resistor r8 = new Resistor(40,I,J);     // id is 8
         Resistor r9 = new Resistor(45,J,K);     // id is 9
         Resistor r10 = new Resistor(50,K,L);    // id is 10
         Resistor r11 = new Resistor(55,L,M);    // id is 11
         Resistor rTRIAL = new Resistor(88,A,K); // id is 12
         Resistor rTRIAL_TWO = new Resistor(111,B,D); // id is 13
         Resistor rTRIAL_THREE = new Resistor(33,H,H); // id is 14
        
        Circuit Cir = Circuit.getInstance();
        
        Cir.add(r6);
        Cir.add(r8);
        Cir.add(rTRIAL);
        Cir.add(rTRIAL_TWO);
        Cir.add(rTRIAL_THREE);
        
        System.out.println(Cir.toString());
       } 
}

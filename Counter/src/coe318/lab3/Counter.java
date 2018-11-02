/**
 *Objective of this lab was to implement a Counter Class & How objects can be linked together
 * Muhammad Ozair 
 * 500763463
 * Section: 071
 */
package coe318.lab3;
public class Counter {
    //Instance variables here
    private int m, d;
    private Counter l;
    public Counter(int modulus, Counter left) {
        this.m= modulus;
        this.l = left;
    }
    /**
     * @return the modulus
     */
    public int getModulus() {
        return m;
    }

    /**
     * Returns the Counter to the left attached to this
     * Counter.  Returns null if there is no Counter
     * to the left.
     * @return the left
     */
    public Counter getLeft() {
        return l;
    }

    /**
     * @return the digit
     */
    public int getDigit() {
        return d;
    }

    /**
     * @param digit the digit to set
     */
    public void setDigit(int digit) {
        this.d=d;
    }

    /**
     * Increment this counter.  If it rolls over,
     * its left Counter is also incremented if it
     * exists.
     */
    public void increment() {
        if(d+1>=m){
            d=0;
            if(l!=null)
                l.increment();
        }
            else 
                d++;
        }
    
    /** Return the count of this Counter combined
     * with any Counter to its left.
     *
     * @return the count
     */
    public int getCount() {
        if(l!=null){
            if(l.getCount()>0)
                return d+m*l.getCount();
            else 
                return d; 
        }
        else 
            return d;
    }

    /** Returns a String representation of the Counter's
     * total count (including its left neighbour).
     * @return the String representation
     */
    @Override
    public String toString() {
        //DO NOT MODIFY THIS CODE
        return "" + getCount();
    }

}
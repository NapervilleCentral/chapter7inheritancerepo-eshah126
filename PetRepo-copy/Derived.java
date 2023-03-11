
/**
 * Write a description of class Derived here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Derived extends Base
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Derived
     */
    public void display()
    {
        System.out.println("Inside the derived class");
    }
    
    //base class shoulg get highest priority 
    public static void main (String[] args){
        
        Base d = new Derived();
        d.display();
    }
    
}

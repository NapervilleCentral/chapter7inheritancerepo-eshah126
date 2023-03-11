import java.util.Scanner;

/**
 * Write a description of class Manager here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Manager extends Employee
{
    // instance variables - replace the example below with your own
    public double allowence;
    Scanner scan = new Scanner(System.in); 
    /**
     * Constructor for objects of class Manager
     */
    public Manager()
    {
        
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void calculateSalary()
    {
        System.out.println("What is your allowence");
        allowence = scan.nextDouble();
        salary+=allowence;
        System.out.println(salary);
    }
    public static void main(String[] args){
        //Employee is base class
        
        Manager Esha = new Manager();
        Esha.getData();
        Esha.calculateSalary();
        
    }
    
    
}

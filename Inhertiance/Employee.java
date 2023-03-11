
/**
 * Write a description of class Employee here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;

public class Employee
{
    // instance variables - replace the example below with your own
    public int Em_id;
    public String name;
    public String department;
    public double salary;
    /**
     * Constructor for objects of class Employee
     */
    public Employee()
    {
        
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void getData()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter name");
        name = scan.nextLine();
        System.out.println("Enter depatment");
        department = scan.nextLine();
        System.out.println("Enter id");
        Em_id = scan.nextInt();
        System.out.println("Enter salary");
        salary = scan.nextInt();
        
        
    }
}

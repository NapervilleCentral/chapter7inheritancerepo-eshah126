
/**
 * Write a description of class DancingBug here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;
import info.gridworld.actor.*;
import java.awt.Color;
public class DancingBug extends Bug
{
    // instance variables - replace the example below with your own
    public int []arr;
    public int count;
    /**
     * Constructor for objects of class DancingBug
     */
    public DancingBug(int[] arr)
    {
        this.arr = arr;
        setColor(new Color(222,49,99));
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void act(){
        
        if(count < arr.length-1()){
            for(int i = 0; i < arr[count]; i++){
                turn();
            }
            move();
            move();
            count++;
        }else{
           count = 0;     
            
            
            
        }
        
    }
}

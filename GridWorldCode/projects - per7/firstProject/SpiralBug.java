
/**
 * Write a description of class SpiralBug here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;
import info.gridworld.actor.*;
import java.awt.Color;

public class SpiralBug extends Bug
{
    
/**
 * A <code>Bug</code> is an actor that can move and turn. It drops flowers as
 * it moves. <br />
 * The implementation of this class is testable on the AP CS A and AB exams.
 */
public int count;
public int len;

    /**
     * Constructs a red bug.
     */
    public SpiralBug()
    {
        count = 0;
        len = 0;
        
        setColor(Color.BLUE);
    }

    /**
     * Constructs a bug of a given color.
     * @param bugColor the color for this bug
     */
    public SpiralBug(Color bugColor)
    {
        setColor(Color.YELLOW);
    }
    
    
    
    
    /**
     * Moves if it can move, turns otherwise.
     */
    public void act()
    {
        
        
        System.out.println(len +"------" +count);
       if(count <= len){
           move();
           count++;
           
           
       }
       else{
           turn();
           
            len++;
            count = 0;
        }
    }
        
        
    
                   
               
    
}
    
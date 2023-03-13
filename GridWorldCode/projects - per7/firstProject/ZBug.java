
/**
 * Write a description of class Z here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;
import info.gridworld.actor.*;
import java.awt.Color;

public class ZBug extends Bug
{
    // instance variables - replace the example below with your own
    public int len;
    public Location location;
    public int steps;
    public int change;
    /**
     * Constructor for objects of class Z
     */
    public ZBug(int len)
    {
        this.len = len;
        setColor(Color.YELLOW);
        setDirection(Location.EAST);// the Z has to start thi way __>
        
    }
    

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void act()
    {
       if (canMove() && steps < len && change < 3) {
            move();
            steps ++;
        }else{
            if (getDirection() == Location.EAST && change < 3){
                setDirection(Location.SOUTHWEST);
                change++;
            }else if (getDirection() == Location.SOUTHWEST && change < 3){
                setDirection(Location.EAST);
                change ++;
            }
            steps = 0;
            
        } 
            
    }
}


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

    /**
     * Constructor for objects of class Z
     */
    public ZBug(int len)
    {
        this.len = len;
        setColor(Color.BLUE);
    }
    

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void act()
    {
        if(canMove){
            for(int i = 0;i<len;i++){
                move();
            }
            turn();
            for(int i = 0;i<len;i++){
                move();
            }
            turn();
            for(int i = 0;i<len;i++){
                move();
            }
        }
    }
}

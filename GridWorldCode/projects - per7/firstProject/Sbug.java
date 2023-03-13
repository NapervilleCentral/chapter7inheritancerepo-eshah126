
/**
 * Write a description of class Ebug here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Rock;
import java.awt.Color;
import info.gridworld.grid.Location;
public class Sbug extends Bug
{
    // instance variables - replace the example below with your own
    public Location location;
     public int count;
      public int len;
    /**
     * Constructor for objects of class Ebug
     */
    public Sbug()
    {
        setColor(Color.BLACK);
        setDirection(Location.WEST);
        count = 0;
        len = 4;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void act()
    {
        
        if(count<=len){
            move();
            
        }
       
}
}
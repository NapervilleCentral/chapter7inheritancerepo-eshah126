
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
      public int steps;
      public int steps1;
      public int steps2;
      public int steps3;
      public int steps4;
      public int change;
      public int len1;
    /**
     * Constructor for objects of class Ebug
     */
    public Sbug()
    {
        setColor(Color.BLACK);
        setDirection(Location.WEST);
        count = 0;
        len = 4;
        len1 = 4;
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
            
        } else {
            setDirection(Location.SOUTH);
            if (canMove() && steps1 < len1 && change < 3) {
            move();
            steps1 ++;
        } else if (canMove() && steps2 < len1 && change < 3) {
            setDirection(Location.EAST);
            move();
            steps2 ++;
        } else if(canMove() && steps3 < len1 && change < 3){
            setDirection(Location.SOUTH);
            move();
            steps3 ++;
            
            
            
        } else if(canMove() && steps4 <len1 && change < 3 ){
            setDirection(Location.WEST);
            move();
            steps4++;
            
            
        }
    }
        
        
        
        
        
        
}
}

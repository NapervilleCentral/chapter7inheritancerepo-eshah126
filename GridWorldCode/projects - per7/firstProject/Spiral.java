
/**
 * Write a description of class Spiral here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Spiral extends Bug
{
    public Spiral()
    {
        setColor(Color.RED);
    }

    /**
     * Constructs a bug of a given color.
     * @param bugColor the color for this bug
     */
    public Spiral(Color bugColor)
    {
        setColor(Color.YELLOW);
    }
    
    
    
    
    /**
     * Moves if it can move, turns otherwise.
     */
    public void act()
    {
        int count = 0;int len = 1;
        if (count<=len){
  
        move();          
        count++;
    }
        else
            turn();
            turn();
            len++;
    }
    
    
    
}


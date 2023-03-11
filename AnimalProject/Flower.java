
/**
 * Write a description of class Flower here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Flower
{
    // instance variables - replace the example below with your own
    public String type;
    public int length;
    public boolean has_thorn;

   
public Flower()
    {
        type="Flower";
        length = 10;
        has_thorn = false;
    }

    public Flower(String type,int length,boolean has_thorn){
        this.length = length;
        this.type = type;
        this.has_thorn = has_thorn;
        
        
        
    }
    
    public  String getType(){
        return "You have chosen" +type;
        
        
        
    }
    
    
    
    
    
}

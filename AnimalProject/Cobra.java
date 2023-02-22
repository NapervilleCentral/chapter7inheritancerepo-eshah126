
/**
 * Write a description of class Cobra here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Cobra extends Snake
{
    // instance variables - replace the example below with your own
    

    /**
     * Constructor for objects of class Cobra
     */
    public Cobra(int length)
    /*
     * 
     * If you dont call the parent constructor it will implicity call the default construtctor 
     * Snake does not have a default construtor
     * it will call a defult construcor
     * You can'nt make a child without a parent
     * 
     * 
     * 
     */
    {
        // initialise instance variables
        //super(0);
        //super has the to be the first line in able to change a varibale
        super(24);
        poisionous = true;        
        //super will call the parent, only the parent
        //super.super.toString();-cant call Animal this way
    }

    /**
     * bite will poision anothor animal
     *
     * @param Animal Object
     * @return    the sum of x and y
     * 
     * 
     * 
     * 
     * 
     * bite wil;l 
     */
    public void  bite(Animal poorthing)
    {
        poorthing.poinsed = true;
        //polymorphism 
        
        
        
        //Object has default construcotr, toString-Automatic, 
        
        
        /**
         * 
         * Snake is polymorphic 
         * 
         * 
         * 
         */
        //is a relationship 
        
        //Cobra is an animal
    }
}

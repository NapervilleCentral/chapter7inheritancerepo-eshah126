//********************************************************************
//  Animal.java       Author: Kevin/Terrific/Hayes
//
//  Represents an Animal.
//********************************************************************

public  abstract class Animal//every animal has a type
{
   private String type;
   protected boolean poinsed = false; 

   
   
   public Animal()
    {//this is called by default
        type = "Default";
        
        System.out.println("hello from Animal Default"  );
    }
   /**-----------------------------------------------------------------
   *  Creates a Animal with the given type.
   */
   public Animal(String animalType)
   {
      type = animalType;
      
      System.out.println("hello from Animal");
      //SNAKE IS CHILD CLASS WITHOUT REPTILE
      
      
      
      
      //it gets called explicity call, it will call it explicity 
   }

   /**-----------------------------------------------------------------
   *  Returns this Animals type.
   /*/
   public String getType()
   {
      return type;
   }

    /**-----------------------------------------------------------------
    * This method should return a string indicating how this pet moves.
   /*/
   abstract public String move();//have to write it 
   //does know what to do but you have to write it 



   /**-----------------------------------------------------------------
   * Returns a string representation of this Animal.
   /*/
   public String toString()
   {
      String data = "My type is " + type;
      if (poinsed)
        data  += "I am poisened";
      return data;  
        
        
        
   }


}















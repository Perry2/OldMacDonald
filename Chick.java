class Chick implements Animal {     
     private String myType;     
     private String mySoundOne;
     private String mySoundTwo;     
     public Chick(String type, String sound1, String sound2)     {         
         myType = type;         
         mySoundOne = sound1;
         mySoundTwo = sound2;     
     }     
     public Chick()     {         
         myType = "unknown";         
         mySoundOne = "unknown";
         mySoundTwo = "unknown";   
     }      
     public String getSound()
     {
     	
     	if(Math.random() < 0.5)
     	{
     		return mySoundOne;
     	}
     	else
     	{
     		return mySoundTwo;
     	}
     }     
     public String getType(){return myType;} 
}
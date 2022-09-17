class Speaker{
  static String color;
  static double price;
  static boolean isConnected;
  static int minVolume;
  static int maxVolume=8;
  static int currentVolume; 
  //functionality
  public static boolean onOrOff()
  {
	  System.out.println("-----------------------------------------------");
  System.out.println("inside onOrOff()");
  if(isConnected==false)
  {
  isConnected=true;
System.out.println("Speaker is turned on... ");	  
    }
  //false==false
    else if(isConnected==true)
    {
	  isConnected=false;
	  System.out.println("Speaker is turned off... ");	  
    }
 	  System.out.println("end of onOrOff ");
	  System.out.println("-----------------------------------------------");
  return isConnected;
    }
 //new method 13/8/22
public static void increaseVolume()
    {
		System.out.println("-----------------------------------------------");
	System.out.println("inside increaseVolume");
	//false==true
	if(isConnected==true)
	}
	if(currentVolume<maxVolume)
	{
		currentVolume= currentVolume+1;
		System.out.println("The Current Volume is:"+currentVolume);
		
	}
	else {
		System.out.println("Max Volume reched...");
	}
	}
}
	// decreaseVolume 13/9/22
	
public static void decreaseVolume(){
	System.out.println("--------------------------------------------------- ");
	System.out.println("The is inside  decreaseVolume: ");
	if(isConnected==true)
	{
		if(currentVolume > minVolume)
		{
			currentVolume=currentVolume-1;
			System.out.println("The current Volumeis :"+currentVolume);
		}
		else {
			System.out.println("Min  Volume is reached :" );
		}
	}
	 else{
		System.out.println("Gube... first turn On Speaker :" );
		}	
	System.out.println("This is end of  decrease Volume----");
	}
	
}
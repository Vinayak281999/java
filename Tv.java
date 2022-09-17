class Tv{
static String brand;
static double price;
static boolean isConected;
public static boolean onOrOff(){
System.out.println("inside onOrOff");
   if(isConnected==false){
  isConnected=true;
System.out.println("TV is turned on... ");	  
  }
    else if(isConnected==true){
	  isConnected=false;
	  System.out.println("TV is turned off... ");	  
  }
 	  System.out.println("end of onOrOff ");
  return isConnected;
}  

}




}
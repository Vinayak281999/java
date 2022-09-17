class Torch{
static String brand;
static double price; 
static boolean isLightOn;
public static boolean onOrOff(){
System.out.println("inside onOrOff");
   if(isLightOn==false){
   isLightOn=true;
   System.out.println("Button is On");
   }
   else if(isLightOn==true){
   isLightOn=false;
System.out.println("Button is Off");
}
System.out.println("end of onOrOff ");
  return isLightOn;
}

}
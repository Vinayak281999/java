class SpeakerTester{
  public static void main(String v[]){
	System.out.println("main method started");
   
   Speaker.color="black";
   Speaker.price=300;
   Speaker.onOrOff();      
                                              //html v=5
   System.out.println("Main Method Started");
		System.out.println("-------------------");
		//invoking onOrOff() method
		Speaker1.onOrOff();
		//invoking increaseVolume() method
		Speaker.increaseVolume();
		Speaker.increaseVolume();
		Speaker.increaseVolume();
		Speaker.increaseVolume();
		Speaker.increaseVolume();
		//invoking decreaseVolume() method
		Speaker.decreaseVolume();
		Speaker.decreaseVolume();
		Speaker.decreaseVolume();
		Speaker.onOrOff();//invoking the method 2 nd time is should print..it shows Speaker1 is off...
		Speaker.increaseVolume();//this will not executed due to current Speaker1 is off
	/* 	System.out.println("Main Method Ended");
		System.out.println("Brand is : "+Speaker.brand);
		System.out.println("Colour of Product is : "+Speaker.colour);
		System.out.println("Price is : "+Speaker.price); */


      System.out.println("color is"+Speaker.color);
      System.out.println("price is"+Speaker.price);

   }
}
class SuperMarket3{
 static void getvegatables(String[] vegatables)
{
	System.out.println("inside getvegatables()");

	System.out.println("Size of vegatables"+vegatables.length); // +vegatables.length
	System.out.println("List of vegatables are");
  for(int index =0;index<vegatables.length;index++){
  	System.out.println(vegatables[index]);
	}
		System.out.println("end of vegatables");
		
}

   static void getperfumes(String[] perfumes){
   System.out.println("inside getperfumes()");

	System.out.println("Size of perfumes"+perfumes.length);
	System.out.println("List of perfumes are ");
  for(int index =0;index<perfumes.length;index++){
  	System.out.println(perfumes[index]);
	}
	System.out.println("end of perfumes");
   
   } 
}
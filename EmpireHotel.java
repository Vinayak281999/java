class EmpireHotel{
public static void main(String v[])
{
String type="5 Star Hotel";
String addres="RR Nagar";
String[] managerNames={"Raju","Deepak","Ram"};
int noOfManagers=3;
String foodMenu[]={"Idly", "Dhose", "Water Dhose"};

System.out.println("Welcome to EmpireHotel");

System.out.println("List of Manager");
System.out.println("Destination:"+addres);
System.out.println("Name of List of Manager");
 for(int c=0 ; c<managerNames.length ; c++)
 {
 System.out.println(managerNames[c]+ " ");
 }
 System.out.println("Have the foodMenu");
for(int c=0; c<foodMenu.length; c++)
{
	System.out.println(foodMenu[c]+ " ");}
	
 
}
}
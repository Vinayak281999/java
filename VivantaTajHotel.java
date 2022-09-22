class VivantaTajHotel
{
public static void main(String v[])
{
String type="5 Star Hotel";
String address="Bengluru";
String[] managerNames={"Ravi", "Ram", "Raj", "Abi", "Ram", "Lakshmi"};
int noOfManagers=5;
String foodMenu[]={"Idly", "Dhose", "Water Dhose"};

System.out.println("Welcome to VivantaTajHotel");

System.out.println("List of Manager");
System.out.println("Destination:"+ address);
System.out.println("Name of List of Manager");
 for(int c=0 ; c<managerNames.length ; c++){
 System.out.println(managerNames[c]+ " ");
 }
System.out.println("Have the foodMenu");
for(int c=0; c<foodMenu.length; c++)
{
	System.out.println(foodMenu[c]+ " ");
} 
}
}
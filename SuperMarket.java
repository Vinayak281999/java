class SuperMarket{
static String superMarketName="Reliance Mart";
//static String vegatables[];
public static void main(String a[])
{
	System.out.println("Welcome to"+superMarketName);
	
	String vegatables[]={"Lady's Finger","tomato",};
	
	String perfumes[]={"Fogg","Axa","Shit","Scret","Park"};
	
	System.out.println("List of vegatables");
	for(int v = 0; v<vegatables.length;v++){
		
	System.out.println(vegatables[v] + "");}
	
	System.out.println("------perfumes Section----");
	for(int v = 3; v<perfumes.length;v++){
		
		System.out.println(perfumes[v] + "");
}
}

}
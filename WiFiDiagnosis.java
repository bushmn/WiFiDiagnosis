import java.util.Scanner;
/** Program that goes through steps of WiFi diagnosis */
public class WiFiDiagnosis { 
	/** Main @param args */
	public static void main (String[] args) { 


Scanner sc = new Scanner(System.in);
/** Beginning of application questions */
System.out.println("Start");  
System.out.println("Reboot the computer and try to connect.");
System.out.println("Did that fix the problem? (yes or no)");
String userInput = sc.nextLine();

/** If user types in no, this will follow */
if (userInput.toLowerCase().equals("no")) 

{
	 System.out.println("Reboot the router and try to connect.");
	 System.out.println("Did that fix the problem? (yes or no)");
	 userInput = sc.nextLine();
}
/** If user types in yes, this will follow */
else 

{
	System.exit(0);
}
/** If user types in no, this will follow */

if (userInput.toLowerCase().equals("no")) 

{
	 System.out.println("Make sure the cables connecting the router are firmly plugged in and power is getting to the router.");
	 System.out.println("Did that fix the problem? (yes or no)");
	 userInput = sc.nextLine();
}
/** If user types in yes, this will follow */
else  

{
	System.exit(0);
}
/** If user types in no, this will follow */
if (userInput.toLowerCase().equals("no")) 

{
	 
	 System.out.println("Move the computer closer to the router and try to connect.");
	 System.out.println("Did that fix the problem? (yes or no)");
	 userInput = sc.nextLine(); 
}
/** If user types in yes, this will follow */
else  

{
	System.exit(0);
}
/** If user types in no, this will follow */
if (userInput.toLowerCase().equals("no")) 
{
	System.out.println("Contact your ISP.");
}
/** If user types in yes, this will follow */
else 

{
	System.exit(0);
}
/** Closing scanner */
sc.close(); 


}
}







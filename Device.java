import java.util.Scanner;

public class Device 
{
	private String name;
	protected boolean status;
	protected Device()
	{
		String statusString = " ";
		Scanner in = new Scanner(System.in);
		System.out.print("Device: ");
		name = in.nextLine();
		do
		{
			System.out.print("Status (ON/OFF)");
			statusString = in.next();
			statusString = statusString.toLowerCase();
		}
		while(!(statusString != "on" || statusString != "off"));
		System.out.println();
		if(statusString=="on")
			status = true;
		else
			status = false;
	}
	protected Device(String nameTemp, boolean statusTemp)
	{
		name = nameTemp;
		status = statusTemp;
	}	 
	
	public String toString()
	{
		String statusTemp=" ";
		if(status)
			statusTemp = "On";
		else
			statusTemp = "Off";
		return "\n The " +name + " is " + statusTemp + ".\n"; 
	}
}

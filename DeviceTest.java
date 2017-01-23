import static org.junit.Assert.*;

import org.junit.Test;


public class DeviceTest 
{

	/*@Test
	public void test() 
	{
		Device deviceTemp = new Device();
	}
	@Test
	public void constructor1()
	{
		Device deviceTemp = new Device("Thermostate", false);
	}*/
	@Test
	public void toStringTest()
	{
		Device deviceTemp = new Device("Thermostate", false);
		System.out.print(deviceTemp);
	
	}
}

/**
 * This is a subclass derived from Users.
 * @author ali utku ünlü
 * @version 1.3
 * @since 12/04/2017
 *
 */
public class Employee extends Users 
{
	protected int sallary;
	
	/**
	 * @param adminOrTechName Name of admin person or technician person
	 */
	public static void listItem(String adminOrTechName)
	{
		int controller = 0;
		int controller2 = 0;
		for (Admin adm : Main.adminList)
		{
			if(adm.name.equalsIgnoreCase(adminOrTechName))
			{
			controller = 1;
			break;
			}
		}
		
		for (Technician adm : Main.techList)
		{
			if(adm.name.equalsIgnoreCase(adminOrTechName))
			{
			controller2 = 1;
			break;
			}
		}
		if (controller == 1 || controller2 ==1)
		{
			
		}
		else
		{
			System.out.println("No admin or technician person named "+ adminOrTechName +" exists!");
		}
	}
	
	/**
	 * @param adminOrTechName Name of admin person or technician person
	 * @param maxStockAmount  Upper bound of stock
	 */
	public static void showItemsLowOnStock(String adminOrTechName, int maxStockAmount)
	{
		System.out.println("COMMAND TEXT: <SHOWITEMSLOWONSTOCK\t"+ adminOrTechName +"\t" + maxStockAmount +">");
		int controller = 0;
		int controller2 = 0;
		for (Admin adm : Main.adminList)
		{
			if(adm.name.equalsIgnoreCase(adminOrTechName))
			{
			controller = 1;
			break;
			}
		}
		
		for (Technician adm : Main.techList)
		{
			if(adm.name.equalsIgnoreCase(adminOrTechName))
			{
			controller2 = 1;
			break;
			}
		}
		if (controller == 1 || controller2 ==1)
		{
			
		}
		else
		{
			System.out.println("No admin or technician person named "+ adminOrTechName +" exists!");
		}
	}
	
	/**
	 * @param adminOrTechName Name of admin person or technician person
	 */
	public static void showVip(String adminOrTechName)
	{
		System.out.println("COMMAND TEXT: <SHOWVIP\t"+ adminOrTechName +">");
		int controller = 0;
		int controller2 = 0;
		for (Admin adm : Main.adminList)
		{
			if(adm.name.equalsIgnoreCase(adminOrTechName))
			{
			controller = 1;
			break;
			}
		}
		
		for (Technician adm : Main.techList)
		{
			if(adm.name.equalsIgnoreCase(adminOrTechName))
			{
			controller2 = 1;
			break;
			}
		}
		if (controller == 1 || controller2 ==1)
		{
			
		}
		else
		{
			System.out.println("No admin or technician person named "+ adminOrTechName +" exists!");
		}
	}
}

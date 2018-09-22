/**
 * This is a subclass derived from Employee.
 * @author ali utku ünlü
 * @version 1.3
 * @since 12/04/2017
 *
 */
public class Technician extends Employee 
{
	protected boolean senior;
	protected String status;
	
	/**
	 * @param name1 Name of technician
	 * @param mail1 Mail of technician
	 * @param dateOfBirth1 Birthday of technician
	 * @param sallary1 Sallary of technician
	 * @param senior1 Is he/she senior or not
	 */
	public Technician (String name1, String mail1, String dateOfBirth1, int sallary1, boolean senior1)
	{
		name = name1;
		mail = mail1;
		dateOfBirth = dateOfBirth1;
		sallary = sallary1;
		senior = senior1;
		status = "TECH";
	}
	
	/**
	 * @param techName Technician name
	 */
	public static void showOrders(String techName)
	{
		int controller = 0;
		for (Admin ad : Main.adminList)
			{
			if(ad.name.equalsIgnoreCase(techName))
			{
				controller = 1;
				break;
			}
		}
		
		if(controller == 1)
		{
			
		}
		else
		{
			System.out.println("No technician person named "+ techName +" exists!");
		}
	}
	
	/**
	 * @param techName Technician name
	 * @param item  Item which is going to add.
	 */
	public static void addItem(String techName, String[] item)
	{
		int controller = 0;
		for (Admin ad : Main.adminList)
			{
			if(ad.name.equalsIgnoreCase(techName))
			{
				controller = 1;
				break;
			}
		}
		
		if(controller == 1)
		{
			if(item[0].equals("LAPTOP"))
			{
				Laptop laptop = new Laptop (Integer.parseInt(item[1]), item[2], item[3], Integer.parseInt(item[4]), Integer.parseInt(item[5]), item[6], 
						item[7], Integer.parseInt(item[8]), Integer.parseInt(item[9]), Boolean.parseBoolean(item[10]));
				Main.itemList.add(laptop);
				Laptop.id++;
			
			}
		}
		
		else
		{
			System.out.println("No technician person named "+ techName +" exists!");
		}	
				
			
			
		
		
	}	
	
}

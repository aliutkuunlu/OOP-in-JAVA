/**
 * This is a subclass derived from Employee.
 * @author ali utku ünlü
 * @version 1.3
 * @since 12/04/2017
 *
 */

public class Admin extends Employee
{
	protected String password;
	protected String status;
	
	/**
	 * @param name1 Name of admin
	 * @param mail1 Mail of admin
	 * @param dateOfBirth1 Brithday of admin
	 * @param sallary1 Sallary of admin
	 * @param password1 Password of admin
	 */
	public Admin (String name1, String mail1, String  dateOfBirth1, int sallary1, String password1)
	{
		name = name1;
		mail =mail1;
		dateOfBirth = dateOfBirth1;
		sallary = sallary1;
		password = password1;
		status = "ADMIN";
	}
	
	/**
	 * @param adminName Name of admin
	 * @param customerName Name of custoemer
	 * @param customerMail Mail of custoemer
	 * @param customerBirth Brithday of custoemer
	 * @param initialBalance Customer's money
	 * @param password Password of custoemer
	 */
	public static void addCustomer( String adminName, String customerName, String customerMail, String customerBirth, int initialBalance, String password)
	{
		System.out.println("COMMAND TEXT: <ADDCUSTOMER\t"+ adminName +"\t" + customerName +"\t"+customerMail +"\t" +customerBirth +"\t" 
				+initialBalance +"\t" +password+">");
		int controller = 0;
		for (Admin ad : Main.adminList)
			{
			if(ad.name.equalsIgnoreCase(adminName))
			{
				controller = 1;
				break;
			}
		}
		
		if(controller == 1)
		{
			Customer custom = new Customer(customerName, customerMail, customerBirth, initialBalance, password);
			Main.customerList.add(custom);
		}
		else
		{
			System.out.println("No admin person named "+ adminName +" exists!");
		}
	}
	
	/**
	 * @param adminName  
	 * @param newAdminName 
	 * @param newAdminMail
	 * @param newAdminBrith
	 * @param newAdminSallary
	 * @param newAdminPassword
	 */
	public static void addAdmin(String adminName, String newAdminName, String newAdminMail, String newAdminBrith, int newAdminSallary, String newAdminPassword)
	{
		System.out.println("COMMAND TEXT: <ADDADMIN\t"+ adminName +"\t" +  newAdminName +"\t"+newAdminMail +"\t"+ newAdminBrith+"\t" 
				+newAdminSallary +"\t" +newAdminPassword+">");
		int controller = 0;
		for (Admin ad : Main.adminList)
			{
			if(ad.name.equalsIgnoreCase(adminName))
			{
				controller = 1;
				break;
			}
		}
		if(controller == 1)
		{
			Admin admin = new Admin(newAdminName, newAdminMail, newAdminBrith, newAdminSallary, newAdminPassword);
			Main.adminList.add(admin);
		}
		else
		{
			System.out.println("No admin person named "+ adminName +" exists!");
		}
	}
	
	/**
	 * @param adminName
	 * @param newTechName
	 * @param newTechMail
	 * @param newTechBirth
	 * @param newTechSallary
	 * @param isSenior
	 */
	public static void addTech(String adminName, String newTechName, String newTechMail, String newTechBirth, int newTechSallary, boolean isSenior)
	{
		System.out.println("COMMAND TEXT: <ADDTECH\t"+ adminName +"\t" +  newTechName +"\t"+newTechMail +"\t"+ newTechBirth+"\t" 
				+newTechSallary +"\t" +isSenior+">");	
		int controller = 0;
		for (Admin ad : Main.adminList)
		{
			if(ad.name.equalsIgnoreCase(adminName))
			{
				controller = 1;
				break;
			}
		}
		if(controller == 1)
		{
			Technician tech = new Technician (newTechName, newTechMail, newTechBirth, newTechSallary, isSenior);
			Main.techList.add(tech);
		}
		else
		{
			System.out.println("No admin person named "+ adminName +" exists!");
		}
	}
	
	/**
	 * @param adminName
	 * @param id
	 */
	public static void showCustomer(String adminName, int id)
	{
		System.out.println("COMMAND TEXT: <SHOWCUSTOMER\t"+ adminName +"\t" +  id+">");	
		int controller = 0;
		for (Admin ad : Main.adminList)
		{
			if(ad.name.equalsIgnoreCase(adminName))
			{
				controller = 1;
				break;
			}
		}
		if(controller == 1)
		{
			Main.customerList.get(id).toString();
		}
		else
		{
			System.out.println("No admin person named "+ adminName +" exists!");
		}
	}
	
	/**
	 * @param adminName
	 */
	public static void showCustomers(String adminName)
	{
		System.out.println("COMMAND TEXT: <SHOWCUSTOMERS\t"+ adminName +">");
		int controller = 0;
		for (Admin ad : Main.adminList)
		{
			if(ad.name.equalsIgnoreCase(adminName))
			{
			controller = 1;
			break;
			}
		}
		if(controller == 1)
		{
			Main.adminList.toString();
		}
		else
		{
			System.out.println("No admin person named "+ adminName +" exists!");
		}
	}
	
	/**
	 * @param adminName
	 */
	public static void showAdminInfo(String adminName)
	{
		System.out.println("COMMAND TEXT: <SHOWADMININFO\t"+ adminName +">");
		int controller = 0;
		int id = -1;
		for (Admin ad : Main.adminList)
		{
			id++;
			if(ad.name.equalsIgnoreCase(adminName))
			{
				controller = 1;
				break;
			}
		}
		if(controller == 1 && id != -1)
		{
			Main.adminList.get(id).toString();
		}
		else
		{
			System.out.println("No admin person named "+ adminName +" exists!");
		}
	}
	
	/**
	 * @param adminName
	 * @param startDate
	 * @param endDate
	 * @param itemType
	 * @param rate
	 */
	public static void createCampaign(String adminName, String startDate, String endDate, String itemType, int rate)
	{
		System.out.println("COMMAND TEXT: <CREATECAMPAIGN\t"+ adminName +"\t"+ startDate +"\t"+ endDate +"\t" + itemType+ "\t"+ rate +">");
		int controller = 0;
		for (Admin ad : Main.adminList)
		{
			if(ad.name.equalsIgnoreCase(adminName))
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
			System.out.println("No admin person named "+ adminName +" exists!");
		}
	}
	@Override
	public String toString() 
	{
		return "Admin name: " + this.name +"\n" +"Admin e-mail: " + this.mail + "\n" + "Admin date of birth: " + this.dateOfBirth + "\n";
	}
}








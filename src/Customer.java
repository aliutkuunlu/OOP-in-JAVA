import java.util.ArrayList;
/**
 * This is a subclass derived from Users.
 * @author ali utku ünlü
 * @version 1.3
 * @since 12/04/2017
 *
 */

public class Customer extends Users 
{
	protected int id =0;
	protected String password;
	protected String status;
	protected double balance;
	public static ArrayList<Customer> cart = new ArrayList<Customer>();
	
	/**
	 * @param name1
	 * @param mail1
	 * @param dateOfBirth1
	 * @param balance1
	 * @param password1
	 */
	public Customer (String name1, String mail1, String dateOfBirth1, double balance1, String password1)
	{
		name = name1;
		mail = mail1;
		dateOfBirth = dateOfBirth1;
		balance = balance1;
		password = password1;
		id++;
		status ="CLASSIC";
	}
	
	/**
	 * @param customerId
	 * @param oldPassword
	 * @param newPassword
	 */
	public static void changePassword (int customerId, String oldPassword, String newPassword)
	{
		System.out.println("COMMAND TEXT: <CHPASS\t"+ customerId +"\t" + oldPassword + "\t" + newPassword +">");
		int controller = 0;
		for (Customer cust : Main.customerList)
		{
			if(cust.id == customerId && cust.password.equalsIgnoreCase(oldPassword))
			{
			controller = 1;
			break;
			}
		}
		if(controller ==1)
		{
			Main.customerList.get(customerId).password = newPassword;
			System.out.println("The password has been successfully changed.");
		}
		else
		{
			System.out.println("No customer with ID number" + customerId + " exists!");
		}
		
	}

	/**
	 * @param customerId
	 * @param loadAmount
	 */
	public static void depositMoney(int customerId, double loadAmount)
	{
		System.out.println("COMMAND TEXT: <DEPOSITMONEY\t"+ customerId +"\t" + loadAmount +">");
		int controller = 0;
		for (Customer cust : Main.customerList)
		{
			if(cust.id == customerId)
			{
			controller = 1;
			break;
			}
		}
		if(controller==1)
		{
			Main.customerList.get(customerId).balance += loadAmount;
		}
		else
		{
		System.out.println("No customer with ID number" + customerId + " exists!");
		}
	}
	
	/**
	 * @param customerId
	 */
	public static void showCampaigns(int customerId)
	{
		System.out.println("COMMAND TEXT: <SHOWCAMPAIGNS\t"+ customerId +">");
		int controller = 0;
		for (Customer cust : Main.customerList)
		{
			if(cust.id == customerId)
			{
			controller = 1;
			break;
			}
		}
		if(controller==1)
		{
			
		}
		else
		{
		System.out.println("No customer with ID number" + customerId + " exists!");
		}
	}
	
	/**
	 * @param customerId
	 * @param itemId
	 */
	public static void addToCart(int customerId, int itemId)
	{
		System.out.println("COMMAND TEXT: <ADDTOCART\t"+ customerId +"\t" + itemId +">");
		int controller = 0;
		for (Customer cust : Main.customerList)
		{
			if(cust.id == customerId)
			{
			controller = 1;
			break;
			}
		}
		if(controller==1)
		{
			
		}
		else
		{
		System.out.println("No customer with ID number" + customerId + " exists!");
		}
	}
	
	/**
	 * @param customerId
	 */
	public static void emptyCart(int customerId)
	{
		System.out.println("COMMAND TEXT: <EMPTYCART\t"+ customerId +">");
		int controller = 0;
		for (Customer cust : Main.customerList)
		{
			if(cust.id == customerId)
			{
			controller = 1;
			break;
			}
		}
		if(controller==1)
		{
			
		}
		else
		{
		System.out.println("No customer with ID number" + customerId + " exists!");
		}
	}
	
	/**
	 * @param customerId
	 * @param password
	 */
	public static void order(int customerId, String password)
	{
		System.out.println("COMMAND TEXT: <ORDER\t"+ customerId +"\t" + password +">");
		int controller = 0;
		for (Customer cust : Main.customerList)
		{
			if(cust.id == customerId)
			{
			controller = 1;
			break;
			}
		}
		if(controller==1)
		{
			
		}
		else
		{
		System.out.println("No customer with ID number" + customerId + " exists!");
		}
	}
	@Override
	public String toString() 
	{
		return "Customer name: " + this.name +"\n" + "ID: " + this.id +"\n" +"e-mail: " + this.mail + "\n" + "Date Of Brith: "
				+ this.dateOfBirth + "\n" + "Status: " + this.status+ "\n";
	}
	
}







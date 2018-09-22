import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * @author ali utku ünlü
 * @version 1.3
 * @since 12/04/2017
 *
 */
public class Main {

	public static ArrayList<Admin> adminList = new ArrayList<Admin>();
	public static ArrayList<Technician> techList = new ArrayList<Technician>();
	public static ArrayList<Customer> customerList = new ArrayList<Customer>();
	public static ArrayList<Items> itemList = new ArrayList<Items>();

	
	
	/**
	 * @param args text files
	 * @throws IOException Throws IO exception
	 */
	
	public static void main(String[] args) 
	{	
		try
		{
			Scanner user = new Scanner (new File(args[0]));
			
			while (user.hasNextLine())
			{
				String line = user.nextLine();
				String [] tokens = line.split("\t");
				controlUser(tokens);			
			}
			
			user.close();
		}
		catch (FileNotFoundException ex)
		{
			System.out.println("No File Found!");
		}
		
		try
		{
			Scanner item = new Scanner (new File(args[1]));
			
			while (item.hasNextLine())
			{
				String line = item.nextLine();
				String [] tokens2 = line.split("\t");
				controlItem(tokens2);			
			}
			
			item.close();
		}
		catch (FileNotFoundException ex)
		{
			System.out.println("No File Found!");
		}

		try
		{
			Scanner command = new Scanner (new File(args[2]));
			
			while (command.hasNextLine())
			{
				String line = command.nextLine();
				String [] tokens3 = line.split("\t");
				controlCommand(tokens3);
			}
			
			command.close();
		}
		catch (FileNotFoundException ex)
		{
			System.out.println("No File Found!");
		}

	}



	/**
	 * @param tokens
	 */
	public static void controlUser (String [] tokens)
	{
		if (tokens[0].equals("ADMIN"))
		{
			Admin admin = new Admin(tokens[1], tokens[2], tokens[3], Integer.parseInt(tokens[4]), tokens[5]);
			adminList.add(admin);
			
		}
		else if (tokens[0].equals("CUSTOMER"))
		{
			Customer custom = new Customer(tokens[1], tokens[2], tokens[3], Double.parseDouble(tokens[4]), tokens[5]);
			customerList.add(custom);
		}
		else if (tokens[0].equals("TECH"))
		{
			Technician tech = new Technician (tokens[1], tokens[2], tokens[3], Integer.parseInt(tokens[4]), Boolean.parseBoolean(tokens[5]));
			techList.add(tech);
		}
		else 
		{
			System.out.println("Undefined user type!!");
		}
		
	}
	
	/**
	 * @param tokens
	 */
	public static void controlItem (String [] tokens)
	{
		if (tokens[0].equals("BOOK"))
		{
			Book book = new Book(Integer.parseInt(tokens[1]), Integer.parseInt(tokens[2]), tokens[3], tokens[4], tokens[5], Integer.parseInt(tokens[6]));
			itemList.add(book);
			Book.id++;
		}
		else if (tokens[0].equals("CDDVD"))
		{
			CD_DVD cddvd = new CD_DVD (Integer.parseInt(tokens[1]), Integer.parseInt(tokens[2]), tokens[3], tokens[4], tokens[5]);
			itemList.add(cddvd);
			CD_DVD.id++;
		}
		else if (tokens[0].equals("DESKTOP"))
		{
			Desktop desktop = new Desktop(Integer.parseInt(tokens[1]), tokens[2], tokens[3], Integer.parseInt(tokens[4]), 
					Integer.parseInt(tokens[5]), tokens[6], tokens[7], Integer.parseInt(tokens[8]),Integer.parseInt(tokens[9]), tokens[10]);
			itemList.add(desktop);
			Desktop.id++;
		}
		else if (tokens[0].equals("LAPTOP"))
		{
			Laptop laptop = new Laptop (Integer.parseInt(tokens[1]), tokens[2], tokens[3], Integer.parseInt(tokens[4]), Integer.parseInt(tokens[5]), tokens[6], 
					tokens[7], Integer.parseInt(tokens[8]), Integer.parseInt(tokens[9]), Boolean.parseBoolean(tokens[10]));
			itemList.add(laptop);
			Laptop.id++;
		}
		else if (tokens[0].equals("TABLET"))
		{
			Tablet tablet = new Tablet (Integer.parseInt(tokens[1]), tokens[2], tokens[3], Integer.parseInt(tokens[4]), Integer.parseInt(tokens[5]), tokens[6], 
					tokens[7], Integer.parseInt(tokens[8]), Integer.parseInt(tokens[9]), Integer.parseInt(tokens[10]));
			itemList.add(tablet);
			Tablet.id++;
		}
		else if (tokens[0].equals("TV"))
		{
			TV tv = new TV (Integer.parseInt(tokens[1]), tokens[2], tokens[3], Integer.parseInt(tokens[4]), Integer.parseInt(tokens[5]), Integer.parseInt(tokens[6]));
			itemList.add(tv);
			TV.id++;
		}
		else if (tokens[0].equals("SMARTPHONE"))
		{
			SmartPhone smartphone = new SmartPhone (Integer.parseInt(tokens[1]), tokens[2], tokens[3], Integer.parseInt(tokens[4]), Integer.parseInt(tokens[5]), tokens[6]);
			itemList.add(smartphone);
			SmartPhone.id++;
		}
		else if (tokens[0].equals("HAIRCARE"))
		{
			HairCare haircare = new HairCare (Integer.parseInt(tokens[1]), tokens[2], tokens[3], Boolean.parseBoolean(tokens[4]), Integer.parseInt(tokens[5]),
					Integer.parseInt(tokens[6]), Boolean.parseBoolean(tokens[7]));
			itemList.add(haircare);
			HairCare.id++;
		}
		else if (tokens[0].equals("SKINCARE"))
		{
			SkinCare skincare = new SkinCare (Integer.parseInt(tokens[1]), tokens[2], tokens[3], Boolean.parseBoolean(tokens[4]), Integer.parseInt(tokens[5]),
					Integer.parseInt(tokens[6]), Boolean.parseBoolean(tokens[7]));
			itemList.add(skincare);
			SkinCare.id++;
		}
		else if (tokens[0].equals("PERFUME"))
		{
			Perfume perfume = new Perfume (Integer.parseInt(tokens[1]), tokens[2], tokens[3], Boolean.parseBoolean(tokens[4]), Integer.parseInt(tokens[5]),
					Integer.parseInt(tokens[6]), Integer.parseInt(tokens[7]));
			itemList.add(perfume);
			Perfume.id++;
		}
		else 
		{
			System.out.println("Undefined item type!!");
		}
	}
	
	
	/**
	 * @param tokens
	 */
	public static void controlCommand (String [] tokens)
	{
		if (tokens[0].equals("ADDCUSTOMER"))
		{
			Admin.addCustomer(tokens[1], tokens[2], tokens[3], tokens[4], Integer.parseInt(tokens[5]), tokens[6]);
		}
		else if (tokens[0].equals("SHOWCUSTOMER"))
		{
			Admin.showCustomer(tokens[1], Integer.parseInt(tokens[2]));
		}
		else if (tokens[0].equals("SHOWCUSTOMERS"))
		{
			Admin.showCustomers(tokens[1]);
		}
		else if (tokens[0].equals("ADDTOCART"))
		{
			Customer.addToCart(Integer.parseInt(tokens[1]), Integer.parseInt(tokens[2]));
		}
		else if (tokens[0].equals("ORDER"))
		{
			Customer.order(Integer.parseInt(tokens[1]), tokens[2]);
		}
		else if (tokens[0].equals("SHOWADMININFO"))
		{
			Admin.showAdminInfo(tokens[1]);
		}
		else if (tokens[0].equals("CREATECAMPAIGN"))
		{
			Admin.createCampaign(tokens[1], tokens[2], tokens[3], tokens[4], Integer.parseInt(tokens[5]));
		}
		else if (tokens[0].equals("SHOWCAMPAIGNS"))
		{
			Customer.showCampaigns(Integer.parseInt(tokens[1]));
		}
		else if (tokens[0].equals("DEPOSITMONEY"))
		{
			Customer.depositMoney(Integer.parseInt(tokens[1]), Double.parseDouble(tokens[2]));
		}
		else if (tokens[0].equals("CHPASS"))
		{
			Customer.changePassword(Integer.parseInt(tokens[1]), tokens[2], tokens[3]);
		}
		else if (tokens[0].equals("EMPTYCART"))
		{
			Customer.emptyCart(Integer.parseInt(tokens[1]));
		}
		else if (tokens[0].equals("SHOWORDERS"))
		{
			Technician.showOrders(tokens[1]);
		}
		else if (tokens[0].equals("SHOWITEMSLOWONSTOCK"))
		{
			Employee.showItemsLowOnStock(tokens[1], Integer.parseInt(tokens[2]));
		}
		else if (tokens[0].equals("SHOWVIP"))
		{
			Employee.showVip(tokens[1]);
		}
		else if (tokens[0].equals("ADDADMIN"))
		{
			Admin.addAdmin(tokens[1], tokens[2], tokens[3], tokens[4], Integer.parseInt(tokens[5]), tokens[6]);
		}
		else if (tokens[0].equals("ADDTECH"))
		{
			Admin.addTech(tokens[1], tokens[2], tokens[3], tokens[4], Integer.parseInt(tokens[5]), Boolean.parseBoolean(tokens[6]));
		}
		else if (tokens[0].equals("ADDITEM"))
		{
			Scanner command = new Scanner (tokens[2]);
			
			while (command.hasNextLine())
			{
				String line = command.nextLine();
				String [] items = line.split(":");
				Technician.addItem(tokens[1], items);
			}
			command.close();
		}
		else if (tokens[0].equals("LISTITEM"))
		{
			Employee.listItem(tokens[1]);
		}
		else if (tokens[0].equals("DISPITEMSOF"))
		{
			
		}
		else 
		{
			System.out.println("Undefined command!!");
		}
		
	}
}
















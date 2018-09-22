/**
 * This is a subclass derived from Electronics.
 * @author ali utku ünlü
 * @version 1.3
 * @since 12/04/2017
 *
 */
public class SmartPhone extends Electronics
{
	protected String screenType;
	
	/**
	 * @param cost1 Cost of item
	 * @param manifacturer1 Manifacturer of item
	 * @param brand1 Brand of item
	 * @param maxVolt1 Maximum Voltage of item
	 * @param maxWatt Maximum Power of item
	 * @param screenType1 Screen Type of item
	 */
	public SmartPhone(int cost1, String manifacturer1, String brand1, int maxVolt1, int maxWatt, String screenType1)
	{
		cost = cost1;
		manifacturer = manifacturer1;
		brand = brand1;
		maxVolt = maxVolt1;
		maxPow = maxWatt;
		screenType = screenType1;
		type = "SMARTPHONE";
		piece ++;
	}
	
}

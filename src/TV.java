/**
 * This is a subclass derived from Electronics.
 * @author ali utku ünlü
 * @version 1.3
 * @since 12/04/2017
 *
 */
public class TV extends Electronics 
{
	protected int screenSize;
	
	/**
	 * @param cost1
	 * @param manifacturer1
	 * @param brand1
	 * @param maxVolt1
	 * @param maxWatt
	 * @param screenSize1
	 */
	public TV (int cost1, String manifacturer1, String brand1, int maxVolt1, int maxWatt, int screenSize1)
	{
		cost = cost1;
		manifacturer = manifacturer1;
		brand = brand1;
		maxVolt =  maxVolt1;
		maxPow = maxWatt;
		screenSize = screenSize1;
		type = "TV";
		piece ++;
	}
}

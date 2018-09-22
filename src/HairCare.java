/**
 * This is a subclass derived from Cosmetic.
 * @author ali utku ünlü
 * @version 1.3
 * @since 12/04/2017
 *
 */
public class HairCare extends Cosmetic
{
	protected boolean medicated;
	
	/**
	 * @param cost1 Cost of item
	 * @param manifacturer1  Manifacturer of item
	 * @param brand1  Brand of item
	 * @param organic1 Is item organic or not.
	 * @param year  Experiation Date of item
	 * @param weight1  Item's weight
	 * @param medic  Is item medicated or not
	 */
	public HairCare (int cost1, String manifacturer1, String brand1, boolean organic1, int year, int weight1, boolean medic)
	{
		cost = cost1;
		manifacturer = manifacturer1;
		brand = brand1;
		organic = organic1;
		experiationDate = year;
		weight  = weight1;
		medicated = medic;
		type = "HAIRCARE";
		piece ++;
		
	}
}

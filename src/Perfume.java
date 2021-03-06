/**
 * This is a subclass derived from Cosmetic.
 * @author ali utku �nl�
 * @version 1.3
 * @since 12/04/2017
 *
 */
public class Perfume extends Cosmetic 
{
	protected int lastingDuration;
	
	/**
	 * @param cost1
	 * @param manifacturer1
	 * @param brand1
	 * @param organic1
	 * @param year
	 * @param weight1
	 * @param lastYear
	 */
	public Perfume (int cost1, String manifacturer1, String brand1, boolean organic1, int year, int weight1, int lastYear)
	{
		cost = cost1;
		manifacturer = manifacturer1;
		brand = brand1;
		organic = organic1;
		experiationDate = year;
		weight  = weight1;
		lastingDuration = lastYear;
		type = "PERFUME";
		piece ++;
		
	}
}

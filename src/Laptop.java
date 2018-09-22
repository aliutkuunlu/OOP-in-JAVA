/**
 * This is a subclass derived from Computers.
 * @author ali utku ünlü
 * @version 1.3
 * @since 12/04/2017
 *
 */
public class Laptop extends Computers
{
	protected boolean hdmiSup;
	
	/**
	 * @param cost1
	 * @param manifacturer1
	 * @param brand1
	 * @param maxVolt1
	 * @param maxWatt
	 * @param os
	 * @param CPUType
	 * @param ramCapa
	 * @param HDDCapa
	 * @param hdmi
	 */
	public Laptop (int cost1, String manifacturer1, String brand1, int maxVolt1, int maxWatt, String os, String CPUType, int ramCapa, int HDDCapa, boolean hdmi )
	{
		cost = cost1;
		manifacturer = manifacturer1;
		brand = brand1;
		maxVolt = maxVolt1;
		maxPow = maxWatt;
		operatingSystem = os;
		cpuType = CPUType;
		ramCapacity = ramCapa;
		hddCapacity = HDDCapa;
		hdmiSup =hdmi;
		type = "LAPTOP";
		piece ++;
	}
}

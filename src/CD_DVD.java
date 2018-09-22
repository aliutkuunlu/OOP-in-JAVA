/**
 * This is a subclass derived from OfficeSuplies.
 * @author ali utku ünlü
 * @version 1.3
 * @since 12/04/2017
 *
 */
public class CD_DVD extends OfficeSuplies
{
	protected String composer;
	protected String song;
	
	/**
	 * @param cost1
	 * @param releaseDate1
	 * @param coverTitle1
	 * @param composer1
	 * @param song1
	 */
	public CD_DVD(int cost1, int releaseDate1, String coverTitle1, String composer1, String song1 )
	{
		cost = cost1;
		releaseDate = releaseDate1;
		coverTitle = coverTitle1;
		composer = composer1;
		song = song1;
		type = "CDDVD";
		piece ++;
	}
}

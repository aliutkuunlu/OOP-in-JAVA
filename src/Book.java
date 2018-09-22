/**
 * This is a subclass derived from OfficeSuplies.
 * @author ali utku ünlü
 * @version 1.3
 * @since 12/04/2017
 *
 */
public class Book extends OfficeSuplies
{
	protected String publisher;
	protected String author;
	protected int numPage;
	
	/**
	 * @param cost1
	 * @param releaseDate1
	 * @param coverTitle1
	 * @param publisher1
	 * @param author1
	 * @param numPage1
	 */
	public Book(int cost1, int releaseDate1, String coverTitle1, String publisher1, String author1, int numPage1)
	{
		cost = cost1;
		releaseDate = releaseDate1;
		publisher = publisher1;
		author = author1;
		numPage = numPage1;
		coverTitle = coverTitle1;
		type = "BOOK";
		piece ++;
	}
}


public class Book {
	public final String title;
	public final int releaseYear;
	
	public Book(String title, int releaseYear)
	{
		this.title = title;
		this.releaseYear = releaseYear;
	}
	
	@Override
	public String toString()
	{
		return title + " (" + releaseYear + ")";
	}	
}

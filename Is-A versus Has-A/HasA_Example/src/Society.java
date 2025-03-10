
public class Society {
	public final String name;
	public Registration registrations[];
	
	public Society(String name)
	{
		this.name = name;
	}
	
	@Override
	public String toString()
	{
		return "Society name is " + name;
	}	
}

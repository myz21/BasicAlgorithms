
public class Person {
	public final String name;
	public final String surname;
	public final IdentityCard identityCard;
	public Book books[];
	public Registration registrations[];
	
	public Person(String name, String surname, int issuedYear, int validUntil)
	{
		this.name = name;
		this.surname = surname;
		
		identityCard = new IdentityCard(issuedYear, validUntil);
	}
	
	@Override
	public String toString()
	{
		return name + " " + surname;
	}
};


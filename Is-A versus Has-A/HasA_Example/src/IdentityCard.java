
public class IdentityCard {
	public final int issuedYear;
	public final int validUntil;
	
	public IdentityCard(int issuedYear, int validUntil)
	{
		this.issuedYear = issuedYear;
		this.validUntil = validUntil;
	}
	
	@Override
	public String toString()
	{
		return "Issued at " + issuedYear + ", Valid until: " + validUntil;
	}	
}

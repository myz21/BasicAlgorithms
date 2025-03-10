
public class Test {

	public static void main(String[] args) {
		
		Person ali = new Person("Ali", "Cundurma", 2020, 2030);
		Person veli = new Person("Veli", "Dur", 2010, 2030);
		Person figen = new Person("Figen", "Sor", 2022, 2020);
		Person burcu = new Person("Burcu", "Gecme", 2001, 2050);
		Person mehmet = new Person("Mehmet", "Bunu", 1990, 2000);
		
		Society bookLovers = new Society("Book Lovers");
		Society movieLovers = new Society("Movie Lovers");

		Registration r1 = new Registration(ali, bookLovers);
		Registration r2 = new Registration(ali, movieLovers);
		Registration r3 = new Registration(burcu, movieLovers);
		Registration r4 = new Registration(mehmet, movieLovers);
		Registration r5 = new Registration(veli, bookLovers);
		
		ali.registrations = new Registration[] {r1, r2};
		burcu.registrations = new Registration[] {r3};
		mehmet.registrations = new Registration[] {r4};
		veli.registrations = new Registration[] {r5};
		
		bookLovers.registrations = new Registration[] {r1, r5};
		movieLovers.registrations = new Registration[] {r2, r3, r4};		

		seeSocities(ali);
		
		System.out.println();
		
		seeMembers(bookLovers);
		System.out.println();
		seeMembers(movieLovers);
	}
	
	static void seeSocities(Person p)
	{
		if (p != null && p.registrations != null) {
			for (Registration r : p.registrations) {
				System.out.println(r.society);
			}
		}
	}

	static void seeMembers(Society s)
	{
		if (s != null && s.registrations != null) {
			for (Registration r : s.registrations) {
				System.out.println(r.person);
			}
		}
	}
	
}

public class Tuer implements Seite
{

	private Raum r1;
	private Raum r2;
	public Tuer(Raum r1, Raum r2)
	{
		System.out.println("Ich bin eine neue Tuer zwischen");
		System.out.println(r1.getName() + " und " + r2.getName());
		this.r1 = r1;
		this.r2 = r2;
	}
	
}

package labyProjekt;




public class Raum
{
	private String name;
	private int xPos;
	private int yPos;
	
	Seite[] seitenListe = new Seite[4];

	public Raum(String name, int xPos, int yPos)
	{
		this.name = name;
		this.xPos = xPos;
		this.yPos = yPos;
	}
	
	public void setzeSeite(RICHTUNG r, Seite s)
	{
		seitenListe[r.ordinal()] = s;
	}

}

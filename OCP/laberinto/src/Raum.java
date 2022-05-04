public class Raum
{
	private String name;
	private int xPos;
	private int yPos;
	
	private Seite[] seitenListe = new Seite[4];

	public Raum(String name, int xPos, int yPos)
	{
		System.out.println("Ich bin ein neue Raum mit name =" +name);
		System.out.println("ich bin positioniert in "+ xPos+","+yPos);
		this.name = name;
		this.xPos = xPos;
		this.yPos = yPos;
	}
	
	public void setzeSeite(RICHTUNG r, Seite s)
	{
		seitenListe[r.ordinal()] = s;
		System.out.println("Eine "+ s.getClass().getSimpleName() + " wurde in Richtung "+ r.name()+ " gesetzt!!");
	}

	public String getName()
	{
		return name;
	}

	public int getxPos()
	{
		return xPos;
	}

	public int getyPos()
	{
		return yPos;
	}

}

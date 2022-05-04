//	Aus alle 4 gegebenen Interfaces :
//	Erzeuge jeweils eine Klasse die dieses Interface IMPLEMENTIERT
//	Am Ende erzeuge eine TESTKLASSE (public static void main)
//	die alle 4 Klassen testet.
//	Die Klasse "Steppe" soll z.B. ein "ErzeugeKatze" ausführen und der katze soll miauen.



public class Katze
{
	private String name;
	private int alter;
	
	public Katze(String name, int alter)
	{
		this.name = name;
		this.alter = alter;
	}

	public void miaue()
	{
		System.out.println(name + " miaut und ist "+ alter + " Jahre alt!!");
	}

}

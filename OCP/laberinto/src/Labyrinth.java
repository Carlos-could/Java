import java.util.ArrayList;

public class Labyrinth
{
	ArrayList<Raum> rListe = new ArrayList<>();
	
	public Labyrinth()
	{
		System.out.println("LABYRINTH KLASSE: Raum 1 und Raum 2 werden erzeugt!!");
		Raum start = new Raum("Startraum", 0,0);
		Raum end   = new Raum("Endraum", 1,0);
		
		System.out.println("LABYRINTH KLASSE: TUER ZWISCHEN Raum 1 und Raum 2 wird erzeugt!!");
		Tuer t12 = new Tuer(start,end);
		
		System.out.println("Es werden Tueren und Wande in Raum "+ start.getName()+ " gesetzt wo es hingehoert!!");
		start.setzeSeite(RICHTUNG.NORD, new Wand());
		start.setzeSeite(RICHTUNG.EAST, t12);
		start.setzeSeite(RICHTUNG.SUED, new Wand());
		start.setzeSeite(RICHTUNG.WEST, new Wand());


		System.out.println("Es werden Tueren und Wande in Raum "+ end.getName()+ " gesetzt wo es hingehoert!!");
		
		end.setzeSeite(RICHTUNG.NORD, new Wand());		
		end.setzeSeite(RICHTUNG.EAST, new Wand());		
		end.setzeSeite(RICHTUNG.SUED, new Wand());
		end.setzeSeite(RICHTUNG.WEST,t12);

		System.out.println(start.getName() + " wird in das ArrayList eingetragen!!");
		rListe.add(start);
		System.out.println(end.getName() + " wird in das ArrayList eingetragen!!");
		rListe.add(end);
	}

}

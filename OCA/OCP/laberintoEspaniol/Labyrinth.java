package labyProjekt;

public class Labyrinth
{
	
	public Labyrinth()
	{
		Raum start = new Raum("Startraum", 0,0);
		Raum end   = new Raum("Endraum", 1,0);
		
		Tuer t12 = new Tuer(start,end);
		
		
		start.setzeSeite(RICHTUNG.NORD, new Wand());
		
		start.setzeSeite(RICHTUNG.EAST, t12);
		
		start.setzeSeite(RICHTUNG.SUED, new Wand());
		start.setzeSeite(RICHTUNG.WEST, new Wand());


		
		end.setzeSeite(RICHTUNG.NORD, new Wand());
		
		end.setzeSeite(RICHTUNG.EAST, new Wand());
		
		end.setzeSeite(RICHTUNG.SUED, new Wand());
		end.setzeSeite(RICHTUNG.WEST,t12);

		
	}

}

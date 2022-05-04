package enumBeispiel;

public enum Figur5 implements Flaeche
{
	   RECHTECK { public double flaeche( double a, double b ) { return a * b; } },
	   DREIECK  { public double flaeche( double a, double b ) { return a * b / 2; } },
	   ELLIPSE  { public double flaeche( double a, double b ) { return a * b * Math.PI / 4; } }
;
	@Override
	public double flaeche(double a, double b)
	{
		System.out.println("Interfce dummy!!");
		return 0;
	};
}

public class EnumTest5
{
	public static void main(String[] xxx)
	{
		 double a = 5, b = 6;
	     for( Flaeche f : Figur5.values() )
	     {
	    	 System.out.println( f + ": Flaeche (" + a + ", " + b + ") = " + f.flaeche( a, b ) );
	     }

	}
}

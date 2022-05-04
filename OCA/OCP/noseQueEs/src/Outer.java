public class Outer
{
	static int z=0;
	private String greeting = "Hi";
	protected class Inner
	{
		public int repeat = 3;
		public void go()
		{
			System.out.println(z + " -> "); 
			for (int i = 0; i < repeat; i++)
				System.out.println(greeting);
			z++;
		}
	}
	public void callInner()
	{
		Inner inner = new Inner();
		inner.go();
	}

	public static void main(String[] args)
	{
		Outer outer = new Outer();
		outer.callInner();
		
		//direkte Aufruf!!!
		Outer outer2 = new Outer();
		Inner inner2 = outer2.new Inner(); // create the inner class
		inner2.go();
	}
}

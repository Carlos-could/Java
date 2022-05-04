public class A
{
	private int x = 10;

	class B //inner von A
	{
		private int x = 20;

		class C //inner von B!!!!!
		{
			private int x = 30;

			public void allTheX()
			{
				System.out.println(x); // 30
				System.out.println(this.x); // 30
				System.out.println(B.this.x); // 20
				System.out.println(A.this.x);
			}
		}
	}

	public static void main(String[] args)
	{
		A a = new A();
		A.B b = a.new B();
		A.B.C c = b.new C();
		c.allTheX();
	}
}
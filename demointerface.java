interface one
{
	public void show();
}
interface two extends one
{
	public void show1();
}
interface three extends two
{
	public void show2();
}
class a implements three
{
	a()
	{
		System.out.println("JAVA");
	}
	public void show()
	{
		System.out.println("Hiii");
	}
	public void show1()
	{
		System.out.println("Hello");
	}
	public void show2()
	{
		System.out.println("Welcome");
	}
	
}
class b implements three
{
	b()
	{
		System.out.println("J");
	}
	public void show()
	{
		System.out.println("A");
	}
	public void show1()
	{
		System.out.println("V");
	}
	public void show2()
	{
		System.out.println("A");
	}
	
}
	
class demointerface
{
	public static void main(String args[])
	{
		a obj=new a();
		obj.show();
		obj.show1();
		obj.show2();
		b obj1=new b();
		obj1.show();
		obj1.show1();
		obj1.show2();
	}
}
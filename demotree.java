import java.util.*;

class a
{
	TreeSet<String> h1=new TreeSet<String>();
	
	a()
	{
		h1.add("Apple");
		h1.add("Orange");
		h1.add("Graps");
		h1.add("Mango");

		for(String s:h1)
		{
			System.out.println(s);
		}
	}
}
class demotree
{
	public static void main(String args[])
	{
		a obj=new a();
	}
}
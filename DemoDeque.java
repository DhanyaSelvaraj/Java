import java.util.*;

public class DemoDeque
{
	public static void main(String args[])
	{
		ArrayDeque<String> d=new ArrayDeque<String>();
		
		d.add("Dhanya");
		d.add("Sowmi");
		d.add("Koki");
		
		Iterator itr=d.iterator();
	
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
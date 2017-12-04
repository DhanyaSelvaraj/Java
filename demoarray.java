import java.io.*;
class a
{
	int x[]=new int[10];
	DataInputStream din=new DataInputStream(System.in);
	
	a()
	{
		for(int i=0;i<10;i++)
		{
			try{
				x[i]=Integer.valueOf(din.readLine()).intValue();
			}catch(IOException e){}
		}
	}
}
class demoarray
{
	public static void main(String args[])
	{
		a obj=new a();
	}
}
import java.io.*;
class sample
{
	DataInputStream din=new DataInputStream(System.in);
	public void display()
	{
		System.out.println("Enter the values");
		try
		{
			int x=Integer.parseInt(din.readLine());
			System.out.println("Enter the value of X="+x);
			int y=Integer.parseInt(din.readLine());
			System.out.println("Enter the value of Y="+y);
			System.out.println("Sum="+(x+y));
		}
		catch(IOException d){}		
	}
}
class demoinput
{
	public static void main(String args[])
	{
		sample obj=new sample();
		obj.display();
	}
}
class Sample
{
	int rollno;
	String name;
	static String place="Salem";
	Sample(int r,String n)
	{
		rollno=r;
		name=n;
			
	}
	public void output()
	{
		System.out.println("Rollno: "+rollno);
		System.out.println("Name: "+name);
		System.out.println("Place: "+place);
	}
}
class Demostatic1
{
	public static void main(String args[])
	{
		Sample obj=new Sample(01,"Dhanya");
		Sample obj1=new Sample(02,"Priya");
		obj.output();
		obj1.output();
	}
}
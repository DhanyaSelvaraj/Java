class student
{
	String name;
	int age,roll;
	public void getstudent(String s,int x,int y)
	{
		name=s;age=x;roll=y;
		System.out.println("Name ="+name);
		System.out.println("Age ="+age);
		System.out.println("Rollno ="+roll);
	}
}
class employee extends student
{
	String desig="Software engg";
	public void getemp(String s,int x,int y)
	{
		name=s;age=x;roll=y;
		System.out.println("Designation ="+desig);
		System.out.println("Name="+name);
		System.out.println("Age="+age);
		System.out.println("Rollno="+roll);	
	}
}
class inheritmethod
{
	public static void main(String args[])
	{
		student obj=new student();
		obj.getstudent("Dhanya",21,8);
		employee obj1=new employee();
		obj1.getemp("sanjay",19,5);
	}
}

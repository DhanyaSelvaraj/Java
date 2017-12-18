class DemoClone implements Cloneable
{
	int rollno;
	String name;
	DemoClone(int rollno,String name)
	{
		this.rollno=rollno;
		this.name=name;
	}
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
	public static void main(String args[])
	{
		try{
			DemoClone s1=new DemoClone(01,"Dhanya");
			DemoClone s2=(DemoClone)s1.clone();
			DemoClone s3=new DemoClone(02,"Sanjay");
		
	
			System.out.println(s1.rollno+" "+s1.name);
			System.out.println(s2.rollno+" "+s2.name);
			System.out.println(s3.rollno+" "+s3.name);
		}catch(CloneNotSupportedException e){}
	}
}


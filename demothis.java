class b
{
	int i,j,k;
	public void a(int i,int j)
	{
		this.i=i;
		this.j=j;
		this.k=i+j;
	}
	public void c()
	{
		System.out.println("The Sum is "+k);
	}
}
class demothis
{
	public static void main(String args[])
	{
		b obj=new b();
		obj.a(10,20);
		obj.c();
	}
}

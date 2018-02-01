class sample extends Thread
{
	Thread t=new Thread(this);
	sample()
	{
		t.start();
	
		System.out.println(t.getName());
	}
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			try{
				t.sleep(1000);	
			}catch(Exception e){}
			System.out.println("Child thread: "+i);
		}
	}
}
class demothread
{
	public static void main(String args[])
	{
		sample obj=new sample();
		
	}
}

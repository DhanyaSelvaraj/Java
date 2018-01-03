class sample extends Thread
{
	Thread t=new Thread(this);
	sample()
	{
		System.out.println("Hiii "+t.getName());
	}	
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(i);
			try{
				t.sleep(1000);
			}
			catch(InterruptedException d){}
		}	
	}
}
class demothread
{
	public static void main(String args[])
	{
		sample obj=new sample();
		obj.start();
		
		Thread t=Thread.currentThread();
		
		try{
			obj.join();
		}
		catch(InterruptedException dd){}
		
		sample obj1=new sample();
		obj1.start();
	}
}
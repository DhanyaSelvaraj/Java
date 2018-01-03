class Callme
{
	synchronized public void call(String msg)
	{
		System.out.println("["+msg);
		try{
			Thread.sleep(1000);
		}
		catch(InterruptedException e){}
		System.out.println("]");
	}
}

class Caller extends Thread
{
	String msg;
	Callme target;
	Thread t;
	
	Caller(Callme targ,String s)
	{
		target=targ;
		msg=s;
		t=new Thread(this);
		t.start();	
	}
	public void run()
	{
		target.call(msg);
	}
}
class demosync
{
	public static void main(String args[])
	{
		Callme target=new Callme();
		Caller obj1=new Caller(target,"Hiii");
		Caller obj2=new Caller(target,"Hello");
		Caller obj3=new Caller(target,"Welcome");
	}
}
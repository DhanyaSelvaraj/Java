class customer
{
	int amount=5000;
	
	synchronized public void withdraw(int amount)
	{
		System.out.println("Go to Withdraw Amount");
		if(this.amount<amount)
		{
			try{
				wait();
			}
			catch(InterruptedException e){}
			this.amount-=amount;
			
			System.out.println("Withdraw completed");
		}
	}
	synchronized public void deposit(int deposit)
	{
		System.out.println("Go to Deposit Amount");
		this.amount+=amount;
		System.out.println("Deposit completed");
		
		notify();
	}
}
class demobank
{
	public static void main(String args[])
	{
		customer c=new customer();
		
		new Thread()
		{
			public void run()
			{
				c.withdraw(15000);
			}
		}.start();
	
		new Thread()
		{
			public void run()
			{
				c.deposit(10000);
			}
		}.start();
	}
}
	

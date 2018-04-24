	class sample
		{
			public void display(String str)
				{
					System.out.println("Baseclassmethod"+str);

				}

		}
	class sample1 extends sample
		{
			public void display(String str)
				{
					System.out.println("derivedclassmethod"+str);

				}
				

		}
	class demooverriding
		{
			public static void main(String args[])
				{
					sample ref;
					
					sample obj=new sample();
					sample1 obj1=new sample1();
			
					ref=obj;
					ref.display("salem");
					
					ref=obj1;
					ref.display("hiii");
					
			


				}
		}

	abstract class sample
		{
			public void display()
				{
					System.out.println("hai");
				}
			public void display1()
				{
					System.out.println("hello");
				}
			abstract public void show1();
			abstract public void show2();
			abstract public void show3();
			abstract public void show4();
		}
	class sample1 extends sample
		{
			public void show1()
				{
					System.out.println("how are you");
				}
			public void show2()
				{
					System.out.println("i am fine");
				}
				
			 public void show3(){}
			 public void show4(){}
		}
	class abstractdemo
		{
		public static void main(String str[])
			{
				sample1 obj=new sample1();
				obj.display();
				obj.display1();
				obj.show1();
				obj.show2();
			}
		}

			
				




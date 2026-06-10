package Day10;

class Case1 extends Thread
{
	public void run()
	{
		for(int i=1; i<=5; i++)
		{
			System.out.println("User thread executing");
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				System.out.println("Some error occured");
			}
		}
	}
}

class Case2 extends Thread
{
	public void run()
	{
		for(; ;)
		{
			System.out.println("deamon thread executing");
			try {
				Thread.sleep(4000);
			}
			catch(Exception e)
			{
				System.out.println("some problem occured");
			}
		}
	}
}

public class ExampleForThreadTypes {

	public static void main(String[] args) {
		Case1 c1 = new Case1();
		Case2 c2 = new Case2();
		c2.setDaemon(true);
		c1.start();
		c2.start();

	}

}

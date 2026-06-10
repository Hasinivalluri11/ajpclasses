package Day10;
import java.util.Scanner;
class Test1 implements Runnable
{
	public void run()
	{
		Thread t = Thread.currentThread();
		String name=t.getName();
		if(name.equals("ADD")==true)
		{
			add();
		}
		else if(name.equals("CHAR")==true)
		{
			charPrint();
		}
		else
		{
			numberPrint();
		}
	}

	void add()
	{
		System.out.println("addition task started");
		Scanner s = new Scanner(System.in);
		System.out.println("Enter first number");
		int a =s.nextInt();
		System.out.println("Enter second number");
		int b =s.nextInt();
		int c = a + b;
		System.out.println(c);
		System.out.println("Addition task completed");
		
	}
	void charPrint()
	{
		System.out.println("Character printing task ");
		for(int i =65; i<=75; i++)
		{
			System.out.println((char)i);
			try
			{
				Thread.sleep(4000);
			}catch(Exception e)
			{
				System.out.println("some problem occured");
			}
		}
		System.out.println("character printing task completed");
	}
	void numberPrint()
	{
		System.out.println("Number printing task started");
		for(int i=1; i<=10; i++)
		{
			System.out.println(i);
			try {
				Thread.sleep(4000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		System.out.println("Number printing task completed");
		
	}
}
public class ExampleforRunnableInterface {

	public static void main(String[] args) {
	
		Test1 t0 = new Test1();
		Thread t1 = new Thread(t0);
		Thread t2 = new Thread(t0);
		Thread t3 = new Thread(t0);
		t1.setName("Add");
		t2.setName("CHAR");
		t3.setName("NUM");
		t1.start();
		t2.start();
		t3.start();
	}

}

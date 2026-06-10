package Day10;
import java.util.Scanner;
public class Demo2 {

	public static void main(String[] args) throws Exception {
		System.out.println("Addition task started");
		Scanner s = new Scanner(System.in);
		System.out.println("Enter first number");
		int a = s.nextInt();
		System.out.println("Enter the second number");
		int b = s.nextInt();
		int sum = a+b;
		System.out.println(sum);
		System.out.println("Addition task completed");
		System.out.println("Character printing task started");
		for(int i = 65; i<=75; i++)
		{
			System.out.println((char)i);
			Thread.sleep(5000);
		}
		System.out.println("character printing task completed");
		System.out.println("Number printing task started");
		for(int i = 1; i<=10;i++)
		{
			System.out.println(i);
			Thread.sleep(5000);
		}
		System.out.println("Number printed task complete");

	}

}

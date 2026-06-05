package ExceptionHandling;
import java.util.Scanner;

public class ArrayIndexOutOfBound {
	public static void main(String[] args) {
	int[] arr = {1,2,3,4,5};
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter array index");
	int index = sc.nextInt();
	try 
	{
		System.out.println("Array at index " + index + " is :" + arr[index]);
		
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println(e.getMessage());
	}
	finally {
		System.out.println("Inside finally block");
	}
	
	}

}

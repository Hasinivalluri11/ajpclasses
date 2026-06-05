package ExceptionHandling;

public class Example1 {

	public static void main(String[] args) {
		
		int num1 = 30;
		int num2 = 0;
		
		try {
			System.out.println(num1/num2);
		}
		catch(ArithmeticException e)
		{
			System.out.println("some problem occured");
		}
		catch(NullPointerException e)
		{
			System.out.println("some problem occured");
		}
		catch(Exception e)
		{
			System.out.println("Dabba fellow, can't divide by zero");
			System.out.println("check the denominator");
		}
		

	}

}

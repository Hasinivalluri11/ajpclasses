package day3;

public class Matrimony {
	public static void main(String[] args)
	{
		String gender = "Female";
		int age = 25;
		
		if(gender == "Female")
		{
			if(age >= 18)
			{
				System.out.println("Yes, you can get married");
			}
			else {
				System.out.println("Please wait, you are not yet 18");
			}
		}
		else {
			if(age >= 21)
			{
				System.out.println("Yes, you can get married");
			}
			else {
				System.out.println("Please wait, you are not yet 21");
			}
		}
		
	}

}

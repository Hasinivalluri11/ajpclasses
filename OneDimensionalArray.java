package day7;

import java.util.Scanner;
public class OneDimensionalArray {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] age = new int[5];
		
		for(int i=0; i < age.length; i++)
		{
			System.out.println("Enter the age of student"+i );
			age[i]=s.nextInt();
			
		}
		System.out.println("The student ages are:");
		for(int i=0; i < age.length; i++) {
			 System.out.println(age[i]);
		}
		
	}

}

package day3;

public class IfelseifDemo {
	public static void main(String[] args){
		int marks = 100;
		if (marks < 0 || marks > 100){
			System.out.println("Invalid entries");
		}
		else if (marks > 81 && marks <= 100)
		{
			System.out.println("Distinction");
		}
		else if (marks >= 60 && marks <= 80) {
			System.out.println("First Class");
		}
		else if (marks >= 35 && marks <= 59) {
			System.out.println("Second class");
		}
		else {
			System.out.println("Fail");
		}
	}

}

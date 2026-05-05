package day7;

class Student {
	//instance variables
	private String name;
	private int age;
	
	//setter method
	public void setData(String name,int age)//local variables
	{
		this.name=name;
		this.age=age;
	}
	//getter method
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
}

public class Example2 {

	public static void main(String[] args) {
		Student s = new Student();
		s.setData("xyz", 21);
		System.out.println(s.getName());
		System.out.println(s.getAge());
		

	}

}

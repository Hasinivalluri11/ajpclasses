package day7;

class Employee
{
	int id=101;
	String name="xyz";
	double salary=50000.16;
}
public class Test {

	public static void main(String[] args) {
		Employee e = new Employee();
		System.out.println(e.id);
		System.out.println(e.name);
		System.out.println(e.salary);
	}

}

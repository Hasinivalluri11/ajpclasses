package day7;

class Car
{
	private String name;
	private int mileage;
	private int cost;
	
	public Car()//zer0-parameterized constructor
	{
		name = "BMW";
		mileage = 10;
		cost = 700000;
	}
	public Car(String name, int mileage, int cost)//parameterized constructor
	{
		this.name=name;
		this.mileage=mileage;
		this.cost=cost;
	}
	public String getName()
	{
		return name;
	}
	public int getMileage()
	{
		return mileage;
	}
	public int getCost()
	{
		return cost;
	}
}
public class ConstructorOverloading {
	public static void main(String[] args) {
		
		Car c1 = new Car();//calling zero-parameterized
		System.out.println(c1.getName());
		System.out.println(c1.getMileage());
		System.out.println(c1.getCost());
		
		System.out.println("===================");
		Car c2 = new Car("Ferrari",5,900000);
		System.out.println(c2.getName());
		System.out.println(c2.getMileage());
		System.out.println(c2.getCost());
		
	}
	
	

}

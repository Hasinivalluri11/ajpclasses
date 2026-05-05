package day7;

class Car{
	private String name;
	private int mileage;
	private int cost;
	public void setData(String x,int y, int z)
	{
		name=x;
		mileage=y;
		cost=z;
	}
	public String getName()
	{
		return name;
	}
	public int getmileage()
	{
		return mileage;
	}
	public int getcost()
	{
		return cost;
	}
}

public class ExamplrForEncapsulation {

	public static void main(String[] args) {
		Car c = new Car();
		c.setData("Maruthi",60, 200000);
		System.out.println(c.getName());
		System.out.println(c.getmileage());
		System.out.println(c.getcost());
		

	}

}

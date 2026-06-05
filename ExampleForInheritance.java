package day7;
class CreditCard //parentclass
{
	//private
	int cardno = 123455;
	int pin = 11111;
}
class Hacker extends CreditCard//child class
{
	void viewDetails()
	{
		System.out.println(cardno);
		System.out.println(pin);
	}
	void ChangeDetails() //overridding variables
	{
		cardno = 987654;
		pin = 22222;
	}
}

public class ExampleForInheritance {

	public static void main(String[] args) {
		Hacker h = new Hacker();
		h.viewDetails();
		h.ChangeDetails();
		System.out.println("-----------------");
		h.viewDetails();

	}

}

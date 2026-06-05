package day7;

class Demo
{
	void add()
	{
		int a =10;
		int b= 20;
		int sum=a+b;
		System.out.println(sum);
	}
}

class Test{
	void fun()
	{
		System.out.println("--hello--");
	}
}

class Demo1 extends Demo
{
	void sub()
	{
		int a =10;
		int b= 20;
		int sub=a-b;
		System.out.println(sub);
	}
	
}
class Demo2 extends Demo1
{
	void mul()
	{
		int a =10;
		int b= 20;
		int mul=a*b;
		System.out.println(mul);
	}
}
public class ExampleForRules {
	public static void main(String[] args)
	{
		Demo2 d2 = new Demo2();
		d2.add();
		d2.mul();
		d2.sub();
	}

}

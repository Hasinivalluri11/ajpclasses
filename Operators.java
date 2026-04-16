package day3;

public class Operators {
	public static void main(String[] args) {
		System.out.println("---------Arithmetic operators----------");
	int x=30;
	int y=40;
	System.out.println("Addtion :"+(x + y));
	System.out.println("Subtraction :"+(x - y));
	System.out.println("Multiplication:"+(x * y));
	System.out.println("Division :" +(x / y));
	System.out.println("Modulus :"+(x % y));
	
	System.out.println("------Assignment operators-------");

    x = 10;
    x += 5;  // x = x + 5
    System.out.println("value of x: " + x);  // Output: 15

    x -= 3;  // x = x - 3
    System.out.println("value of x: " + x);  // Output: 12

    x /= 2;  // x = x / 2
    System.out.println("value of x: " + x);  // Output: 6

    x *= 3;  // x = x * 3
    System.out.println("value of x: " + x);  // Output: 18
	
	System.out.println("-----------comparision operators--------------");
	int a = 10;
	int b = 20;
	System.out.println(a<b);
	System.out.println(a>b);
	System.out.println(a>=b);
	System.out.println(a<=b);
	System.out.println(a==b);
	System.out.println(a!=b);
	
	System.out.println("----logical operators-----");
	int p=1;
	int q=2;
	
	boolean result= p<q && p==1;
	System.out.println(result);
	System.out.println(p<=4 || q==10);
	System.out.println(!true);
	System.out.println(!false);
	
	System.out.println("---unary operators---");
	int c=20;
	int d=c++ +c-- + ++c + c++ + c-- + ++c - --c;
	System.out.println(c);
	System.out.println(d);
	
	System.out.println("--ternary operator---");
	int num1=200;
	int num2=300;
	int max=num1 > num2 ? num1 : num2;
	System.out.println("Maximum of " +num1 + " & " + num2 +" is " + max);
	}

}

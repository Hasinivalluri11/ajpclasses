package day7;

public class TriangleCheck {

    public static void main(String[] args) {

        int a = 1, b = 2, c = 10; 
        
        if (a + b > c && a + c > b && b + c > a) {

            System.out.println("Valid Triangle");

            
            if (a == b && b == c) {
                System.out.println("Equilateral Triangle");
            } else if (a == b || b == c || a == c) {
                System.out.println("Isosceles Triangle");
            } else {
                System.out.println("Scalene Triangle");
            }

            
            int max = Math.max(a, Math.max(b, c));
            int x, y;
            if (max == a) {
                x = b;
                y = c;
            } else if (max == b) {
                x = a;
                y = c;
            } else {
                x = a;
                y = b;
            }

            if (x * x + y * y == max * max) {
                System.out.println("Right Triangle");
            } else {
                System.out.println("Not a Right Triangle");
            }

        } else {
            System.out.println("Invalid Triangle");
        }
    }
}

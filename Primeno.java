package day3;

public class Primeno {
    public static void main(String[] args) {
        int n = 13;
        int i = 2;

        if (n <= 1) {
            System.out.println(n + " is not prime");
        } else {
            while (i < n) {
                if (n % i == 0) {
                    System.out.println(n + " is not prime");
                    return;
                }
                i++;
            }
            System.out.println(n + " is a prime number");
        }
    }
}
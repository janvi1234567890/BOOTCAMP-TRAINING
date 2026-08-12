import java.util.Scanner;

public class lc50 {

    public static double myPow(double x, int n) {

        long num = n;

        if (num == 0) {
            return 1;
        }

        // negative power
        if (num < 0) {
            x = 1 / x;
            num = -num;
        }

        double half = myPow(x, (int)(num / 2));

        if (num % 2 == 0) {
            return half * half;
        } else {
            return x * half * half;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x: ");
        double x = sc.nextDouble();

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.println("Answer: " + myPow(x, n));
    }
}
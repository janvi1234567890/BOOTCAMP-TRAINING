import java.util.Scanner;

public class lc258 {

    public static int addDigits(int num) {

        if (num < 10) {
            return num;
        }

        int sum = (num % 10) + addDigits(num / 10);

        return addDigits(sum);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        System.out.println("Answer: " + addDigits(num));
    }
}
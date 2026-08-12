 import java.util.Scanner;
 class recursion3{
 public static void printnumber(int n) {

        if (n == 0) {
            return;
        }

        printnumber(n - 1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        printnumber(n);
    }
}
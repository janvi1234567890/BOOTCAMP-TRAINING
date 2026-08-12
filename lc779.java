import java.util.Scanner;

public class lc779 {

    public static int kthGrammar(int n, int k) {

        // Base case
        if (n == 1) {
            return 0;
        }

        // Find parent position
        int parent = (k + 1) / 2;

        // Even position = opposite
        if (k % 2 == 0) {
            return 1 - kthGrammar(n - 1, parent);
        }

        // Odd position = same
        return kthGrammar(n - 1, parent);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.print("Enter k: ");
        int k = sc.nextInt();

        System.out.println("Answer: " + kthGrammar(n, k));
    }
}
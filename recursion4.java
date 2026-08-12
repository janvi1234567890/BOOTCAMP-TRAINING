import java.util.Scanner;

public class recursion4 {
    public static int sumofnumber(int n) {
        if(n==0)
        {
            return 0;
        }
        if(n==1){
            return 1;
        }
        return n + sumofnumber(n -1);

}
public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

       System.out.println(sumofnumber(n));
    }
}


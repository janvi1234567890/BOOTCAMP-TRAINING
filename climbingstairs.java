public class climbingstairs {
    public int climbStairs(int n) {
        if (n <= 2) return n;
        return climbStairs(n - 1) + climbStairs(n - 2);
    }
public static void main(String[] args) {
        climbingstairs obj = new climbingstairs();
        System.out.println(obj.climbStairs(5));
    }
}

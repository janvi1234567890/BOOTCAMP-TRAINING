class recursion1 {

    public static void printnumber(int n) {
        if (n == 0) {
            return;
        }

        printnumber(n - 1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        printnumber(5);
    }
}
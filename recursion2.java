class recursion2 {

    public static void printnumber(int n) {
        if (n == 0) {
            return;
        }

        System.out.println(n);
        printnumber(n - 1);
    }

    public static void main(String[] args) {
        printnumber(5);
    }
}
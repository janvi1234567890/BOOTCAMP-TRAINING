public class lc344recursion {
        public static void reverseString(char[] s) {
        reverse(s, 0, s.length - 1);
    }

    public static void reverse(char[] s, int left, int right) {

        if (left >= right) {
            return;
        }

        char temp = s[left];
        s[left] = s[right];
        s[right] = temp;

        reverse(s, left + 1, right - 1);
    }

    public static void main(String[] args) {

        char[] s = {'h', 'e', 'l', 'l', 'o'};

        reverseString(s);

        for (char c : s) {
            System.out.print(c + " ");
        }
    }
}


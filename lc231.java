public class lc231 {
    public boolean isPowerOfTwo(int n) {
        if(n ==1){
            return true;
        }
        if(n <=0 ||n % 2!=0){
            return false;
        }
        return isPowerOfTwo(n/2);
    }
    public static void main(String[] args){
        lc231 obj = new lc231();
        System.out.println(obj.isPowerOfTwo(16));
    }
}

public class lc342 {
    public boolean isPowerOfFour(int n) {
        if(n ==1 ){
            return true;
        }
       if(n <= 0 || n% 4!=0){
        return false;
       }
       return isPowerOfFour(n/4);
    }

public static void main(String[] args){
        lc342 obj = new lc342();
        System.out.println(obj.isPowerOfFour(16));
    }
}


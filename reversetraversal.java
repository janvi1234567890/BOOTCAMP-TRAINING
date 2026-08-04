public class reversetraversal {
    public static void traversal(int[] arr){
        for(int i = arr.length - 1;i>=0;i--){
            System.out.print(" " +arr[i]);
        }

    }
    public static void main(String[] args) {
        int[] arr = {50,40,30,20,10};
        traversal(arr);
    }
    
}

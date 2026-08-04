public class fifth {
    public static void greaterthan(int[] arr){
        int count = 0;
        for(int i = 0; i < arr.length;i++){
            if(arr[i]>10){
                count++;
            }

        }
        System.out.println("count = " + count);
    
    }
    public static void main(String[] args){
        int[] arr = {1,3,7,11,13,2,5};
        greaterthan(arr);
    }
}

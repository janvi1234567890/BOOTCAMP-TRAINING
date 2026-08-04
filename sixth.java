public class sixth {
    public static void prefix(int[] arr){
        for(int i = 0; i<arr.length;i++){
            arr[i] = arr[i] + arr[i-1];
        }
        
        System.out.println(arr[i]);
        
    }
     public static void main(String[] args) {
        int[] arr = {1,7,3,4};
        prefix(arr);
      
    }
    
}


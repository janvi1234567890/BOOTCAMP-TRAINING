public class selectionsort {
    public static void selection(int[] arr){
         int n = arr.length;
         for(int i = 0 ; i< n -1 ; i++){
            int minindex = i;
            for(int j = i + 1 ; j < n  ; j++){
                if(arr[j] < arr[minindex]){
                    minindex = j;
                }
            }
                    int temp = arr[i];
                    arr[i] = arr[minindex];
                    arr[minindex] = temp;
                }
            }
         
    
    public static void main(String[] args) {
        int[] arr = {10,45,22,5,4,9};
        selection(arr);
        for(int i = 0; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }
}

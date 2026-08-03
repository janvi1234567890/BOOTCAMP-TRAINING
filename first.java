public class first {
    public static int findzeroes(int arr[]){
        int count = 0;
        int n = arr.length;
        for(int i=0; i<n; i++){
            if(arr[i] == 0){
                count++;
            }
        }
        return count;
    }
    public static void main(String args[]){
        int arr[] = {1, 0, 2, 0, 3, 0, 4};
        int result = findzeroes(arr);
        System.out.println(result);


        
    }
}

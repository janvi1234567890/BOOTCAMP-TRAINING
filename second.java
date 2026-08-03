public class second {
    public static void floorceil(int arr[], int target){
        int n = arr.length;
        int floor = -1;
        int ceil = -1;
        for(int i = 0;i<n;i++){
            if(arr[i] <=target){
                floor = arr[i];
            }
            if(arr[i] >= target && ceil == -1){
                ceil = arr[i];
            }
        }
        System.out.println("Floor = " + floor);
        System.out.println("Ceil = " + ceil);
    }
    public static void main(String args[]){
        int arr[] = {1, 2, 3, 4, 5};
        int target = 3;
        floorceil(arr, target);
    }
}

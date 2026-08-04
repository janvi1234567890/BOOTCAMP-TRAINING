class evenodd {
    public static void countno(int arr[]){
        int evenno = 0;
        int oddno = 0;
        for(int i = 0 ; i<arr.length;i++){
            if(arr[i] % 2 == 0){
                evenno++;
            }
            else{
                oddno++;
            }
        }
        System.out.println("even no "+ evenno);
        System.out.println("odd no "+ oddno);


    }
    public static void main(String[] args){
        int[] arr = {30,2,18,17,31,54};
        countno(arr);
        
    }
}


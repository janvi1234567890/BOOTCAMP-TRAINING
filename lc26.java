public class lc26 {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        int j = i+1;
        int n = nums.length;
        while(j<n){
        if(nums[j]==nums[i]){
            j++;
              }
              else{
                //not equal
                i++;
                nums[i] = nums[j];
                j++;
              }
        }
        return i+1;
    }

    public static void main(String[] args) {
        lc26 obj = new lc26();
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int length = obj.removeDuplicates(nums);
        System.out.println("Length of array after removing duplicates: " + length);
        System.out.print("Modified array: ");
        for(int i=0; i<length; i++){
            System.out.print(nums[i] + " ");
        }
    }
}



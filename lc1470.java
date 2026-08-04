public class lc1470 {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2 * n];

        int j = 0;

        for (int i = 0; i < n; i++) {
            ans[j] = nums[i];
            j++;

            ans[j] = nums[i + n];
            j++;
        }

        return ans;
    }
    public static void main(String[] args) {
        lc1470 obj = new lc1470();
        int[] nums = {2,5,1,3,4,7};
        int n = 3;
        int[] shuffledArray = obj.shuffle(nums, n);
        System.out.print("Shuffled array: ");
        for(int num : shuffledArray){
            System.out.print(num + " ");
        }
    }
}


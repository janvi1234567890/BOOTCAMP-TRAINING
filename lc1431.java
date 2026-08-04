import java.util.ArrayList;
import java.util.List;

class lc1431{
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies){
        int maxi = 0;
        for(int i = 0;i < candies.length;i++){
            if(candies[i] >maxi){
                maxi = candies[i];
            }
        }
    List <Boolean> result = new ArrayList<>();
      for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies >= maxi) {
                result.add(true);
            } else {
                result.add(false);
            }
        }

        return result;
    }
    public static void main(String[] args) {
        lc1431 obj = new lc1431();
        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;
        List<Boolean> result = obj.kidsWithCandies(candies, extraCandies);
        System.out.println("Result: " + result);
    }
}

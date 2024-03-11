public class Solution1431 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> result = new ArrayList<Boolean>(candies.length);

        //Fetch the greatest candies any kid has
        int maximumCandies = 0;
        for(int i = 0; i < candies.length; i++) {
            if(maximumCandies < candies[i]) {
                maximumCandies = candies[i];
            }
        }

        //Build the result 
        for(int i = 0; i < candies.length; i++) {
            if(candies[i] + extraCandies >= maximumCandies) {
                result.add(i, true);
            } else {
                result.add(i, false);
            }
        }
        return result;
    }
    
}

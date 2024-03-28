class Solution {
  // best time to buy & sell a stock
  // time: 5 mins
     public int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2) return 0;
        int max = 0;
        int maxIndex = 0;
        int min = prices[0];
        int minIndex = 0;
        for (int i = 1 ; i < prices.length ; i++) {
            if (prices[i] < min) {
                min = prices[i];
                minIndex = i;
            }
            if (prices[i] > max && i > minIndex) {
                max = prices[i];
                maxIndex = i;
            }
        }
        return (max - min > 0) ? max - min :  0;
    }

  // Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
  // time: 5 mins
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        // populate map
        for (int i = 0; i < nums.length ; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length ; i++) {
            Integer foundIndex = map.get(target-nums[i]);
            if (foundIndex != null) {
                return new int[]{foundIndex, i};
            }
        }
        return null;
    }
}

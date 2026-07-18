class Solution {
   public static int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> prefixSumMap = new HashMap<>();
        prefixSumMap.put(0, 1);
        int count = 0;
        int currentSum = 0;
        for (int num : nums) {
            currentSum += num;
            int requiredPrefix = currentSum - k;
            
            if (prefixSumMap.containsKey(requiredPrefix)) {
                count += prefixSumMap.get(requiredPrefix);
            }
            
            prefixSumMap.put(currentSum, prefixSumMap.getOrDefault(currentSum, 0) + 1);
        }

        return count;
    }
}
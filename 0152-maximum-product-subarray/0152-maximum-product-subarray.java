class Solution {
    public int maxProduct(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int maxSoFar = nums[0];
        int minSoFar = nums[0];
        int result = maxSoFar;
        for (int i = 1; i < nums.length; i++) {
            int currentNum = nums[i];
            if (currentNum < 0) {
                int temp = maxSoFar;
                maxSoFar = minSoFar;
                minSoFar = temp;
            }
            maxSoFar = Math.max(currentNum, maxSoFar * currentNum);
            minSoFar = Math.min(currentNum, minSoFar * currentNum);
            result = Math.max(result, maxSoFar);
        }

        return result;
    }
}
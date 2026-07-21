class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int k=3;
        if (k <= 0 || nums == null || nums.length == 0) {
            return new ArrayList<>();
        }

        Map<Integer, Integer> freqMap = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        int threshold = nums.length / k;
        for (int i = 0; i < nums.length; i++) {
            freqMap.put(nums[i], freqMap.getOrDefault(nums[i], 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() > threshold) {
                result.add(entry.getKey());
            }
        }

        return result;
    }
}
    

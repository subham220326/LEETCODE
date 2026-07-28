class Solution {
    public int subarraysWithXorK(int[] nums, int k) {

        int xr = 0;
        int count = 0;
        
        // HashMap to store the frequency of prefix XORs
        HashMap<Integer, Integer> freq = new HashMap<>();
        
        // Base case: A prefix XOR of 0 happens 1 time initially
        freq.put(0, 1);
        
        for (int num : nums) {
            // Update the running XOR
            xr ^= num;
            
            // Calculate the target we need to find in our map
            int target = xr ^ k;
            
            // If the target exists, add its frequency to our count
            if (freq.containsKey(target)) {
                count += freq.get(target);
            }
            
            // Add the current running XOR to the map, or increment if it exists
            freq.put(xr, freq.getOrDefault(xr, 0) + 1);
        }
        
        return count;
    }

    
}
    

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Leaders {

    // Your corrected logic, made 'static' so we can easily call it from main
    public static List<Integer> findLeaders(int[] nums) {
        List<Integer> result = new ArrayList<>();
        
        if (nums == null || nums.length == 0) {
            return result;
        }

        int maxFromRight = nums[nums.length - 1];
        result.add(maxFromRight);
        
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] >= maxFromRight) {
                result.add(nums[i]);
                maxFromRight = nums[i];
            }
        }
        
        Collections.reverse(result);
        return result;
    }

    // The main method to run the code
    public static void main(String[] args) {
        // Test Case 1
        int[] arr1 = {16, 17, 4, 3, 5, 2};
        List<Integer> result1 = findLeaders(arr1);
        System.out.println("Array 1: [16, 17, 4, 3, 5, 2]");
        System.out.println("Leaders: " + result1); 
        // Expected Output: [17, 5, 2]

        System.out.println("-------------------------");

        // Test Case 2
        int[] arr2 = {1, 2, 3, 4, 0};
        List<Integer> result2 = findLeaders(arr2);
        System.out.println("Array 2: [1, 2, 3, 4, 0]");
        System.out.println("Leaders: " + result2); 
        // Expected Output: [4, 0]
    }
}

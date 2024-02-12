import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // Count the occurrences of each element
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Find the majority element
        int majorityCount = nums.length / 2;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > majorityCount) {
                return entry.getKey();
            }
        }

        // If no majority element found
        return -1; // or any other default value as per requirement
    }
}

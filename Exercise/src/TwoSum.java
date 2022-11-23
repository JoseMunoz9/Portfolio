import java.util.HashMap;
import java.util.Map;

// Given an array of integers 'nums' and an integer 'target', return indices of the two
// numbers such that they add up to 'target'.

// Conditions: one solution only and the same element can not be used twice.
// Complexity: O(n), which is a linear time complexity.
public class TwoSum {

	public int[] twoSum(int[] nums, int target) {
		
		Map<Integer, Integer> complements = new HashMap<>();
		// Here we are going to loop through all the numbers in the array.
		for (int i = 0; i < nums.length; i++) {
			
			// Here we are going to see if the number we are looking at
			// already exists as a key value in our complement map.
			Integer complementIndex = complements.get(nums[i]);
			
			// If the number is not equal to null, then we know we have a match.
			// If so, then we return the 2 indices.
			if (complementIndex != null) {
				return new int[] {i, complementIndex};
			}
			
			// If we didn't find a match, then we have to calculate the complement and add it
			// to our Map.
			complements.put(target - nums[i], i); // This is how we add an element to the map.
			
		}
		return nums;
	}

}

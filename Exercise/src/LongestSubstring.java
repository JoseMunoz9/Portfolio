
// Given a String 's', find the length of the longest substring without repeating characters.
// Conditions: 's' consists of English letters, digits, symbols and spaces, and
// 0 <= s.length <= 5 * 10^4
// In other words:
// s.length >= 0 (meaning, no negative numbers of characters in our String)
// s.length <= 50,000 (10^4 = 10,000 AND 10,000 * 5 = 50,000).
public class LongestSubstring {

	public int lengthOfLongestSubstring(String s) {
		
		int maxLength = 0;		
		// We are going to call our variables 'right' and 'left', which will represent the
		// right and left pointer in our algorithm.
		// We will only change our left pointer if we find a repeated character in the substring.
		// We only want to increment the right pointer, in every iteration of the loop.
		for (int right = 0, left = 0; right < s.length(); right++) {
			
	// Here we are going to check when we last encounter the current character that we are looking at.
			// We are looking for the index of that current character that right pointer is looking at.
			int indexOfFirstApp = s.indexOf(s.charAt(right), left);
			
			// Here we are going to see if we have a repeated character.
			if (indexOfFirstApp != right) {
				// We move the left pointer to be one past where that repeated character was found.
				left = indexOfFirstApp + 1;
			}
			 // Here we are going to update our Maximum Length.
			 maxLength = Math.max(maxLength, right - left + 1);
		}
		return maxLength;
	}
}

package day4;

import java.util.Scanner;

//Max Consecutive Ones

/* Given a binary array nums, return the maximum number of consecutive 1's in the array.

Example 1:
Input: nums = [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.

Example 2:
Input: nums = [1,0,1,1,0,1]
Output: 2 */

class Solution {
    
    public int findMaxConsecutiveOnes(int[] nums) {

        int currCount = 0;
        int maxCount = 0;

        for(int num : nums){

            if(num == 1){

                currCount++;
            }
            else{

                maxCount = Math.max(maxCount, currCount);
                currCount = 0;
            }
        }
        maxCount = Math.max(maxCount, currCount);
        return maxCount;        
    }
    
    public static void main(String[] args) {
        Solution solution = new Solution();
        
      
        int[] nums1 = {1, 1, 0, 1, 1, 1};
        System.out.println("Output: " + solution.findMaxConsecutiveOnes(nums1)); // Output: 3
        
       
        int[] nums2 = {1, 0, 1, 1, 0, 1};
        System.out.println("Output: " + solution.findMaxConsecutiveOnes(nums2)); // Output: 2
    }
}
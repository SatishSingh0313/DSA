package day9;

//Count sub arrays with given sum

/* 
Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.

A sub array is a contiguous non-empty sequence of elements within an array.

Example 1:
Input: nums = [1,1,1], k = 2
Output: 2

Example 2:
Input: nums = [1,2,3], k = 3
Output: 2 */

import java.util.HashMap;

public class Solution {

    public int subarraySum(int[] nums, int k) {

        int count = 0;
        int sum = 0;

        // Map to store cumulative sum frequencies
        HashMap<Integer, Integer> sumFreq = new HashMap<>();
        sumFreq.put(0, 1); // Initialize with 0 to handle subarrays starting from the beginning

        for (int num : nums) {

            sum += num;

            // Check if (sum - k) exists in the map, add its frequency to the count
            if (sumFreq.containsKey(sum - k)) {

                count += sumFreq.get(sum - k);
            }

            // Update the frequency of the current cumulative sum
            sumFreq.put(sum, sumFreq.getOrDefault(sum, 0) + 1);
        }

        return count;
    }
    
    public static void main(String[] args) {
    	
        Solution solution = new Solution();

        // Example 1
        int[] nums1 = {1, 1, 1};
        int k1 = 2;
        int result1 = solution.subarraySum(nums1, k1);
        System.out.println("Example 1 Output: " + result1); // Output should be 2

        // Example 2
        int[] nums2 = {1, 2, 3};
        int k2 = 3;
        int result2 = solution.subarraySum(nums2, k2);
        System.out.println("Example 2 Output: " + result2); // Output should be 2
    }
}

package day6;

//Majority Element

/*
Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. 
You may assume that the majority element always exists in the array.

Example 1:
Input: nums = [3,2,3]
Output: 3

Example 2:
Input: nums = [2,2,1,1,1,2,2]
Output: 2
*/

class Solution {
    
    public int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;
        
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            
            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }
        
        return candidate;
    }
    public static void main(String[] args) {
    	
        Solution solution = new Solution();

        // Example 1
        int[] nums1 = {3, 2, 3};
        System.out.println("Example 1: " + solution.majorityElement(nums1)); // Output: 3

        // Example 2
        int[] nums2 = {2, 2, 1, 1, 1, 2, 2};
        System.out.println("Example 2: " + solution.majorityElement(nums2)); // Output: 2
    }
}
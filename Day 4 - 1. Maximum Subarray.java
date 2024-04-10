package day6;

//Maximum Sub array

/* Given an integer array nums, find the subarray with the largest sum, and return its sum.

Example 1:
Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: The sub array [4,-1,2,1] has the largest sum 6.

Example 2:
Input: nums = [1]
Output: 1
Explanation: The sub array [1] has the largest sum 1.

Example 3:
Input: nums = [5,4,-1,7,8]
Output: 23
Explanation: The sub array [5,4,-1,7,8] has the largest sum 23.
*/

class Solution {

    public int maxSubArray(int[] nums) {

        int n = nums.length;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        
        for(int i = 0; i < n; i++){

            sum += nums[i];
            max = Math.max(sum,max);
            
            if(sum < 0){

                sum = 0;
            } 
        }   
        return max;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example 1
        int[] nums1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Example 1: " + solution.maxSubArray(nums1)); // Output: 6

        // Example 2
        int[] nums2 = {1};
        System.out.println("Example 2: " + solution.maxSubArray(nums2)); // Output: 1

        // Example 3
        int[] nums3 = {5, 4, -1, 7, 8};
        System.out.println("Example 3: " + solution.maxSubArray(nums3)); // Output: 23
    }
}
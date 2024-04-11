package day11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//4Sum

/* Given an array nums of n integers, return an array of all the unique quadruplets [nums[a], nums[b], nums[c], nums[d]] such that:

0 <= a, b, c, d < n
a, b, c, and d are distinct.
nums[a] + nums[b] + nums[c] + nums[d] == target
You may return the answer in any order.

 

Example 1:

Input: nums = [1,0,-1,0,-2,2], target = 0
Output: [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]
Example 2:

Input: nums = [2,2,2,2,2], target = 8
Output: [[2,2,2,2]] */

class Solution {

    public List<List<Integer>> fourSum(int[] nums, int target) {

        Arrays.sort(nums);
        Set<List<Integer>> s = new HashSet<List<Integer>>();
        List<List<Integer>> output = new ArrayList<List<Integer>>();

        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {

                int k = j + 1;
                int l = nums.length - 1;

                while (k < l) {

                    long sum = nums[i];
                    sum += nums[j];
                    sum += nums[k];
                    sum += nums[l];

                    if (sum == target) {

                        s.add(Arrays.asList(nums[i], nums[j], nums[k], nums[l]));
                        k++;
                        l--;
                    } else if (sum < target) {

                        k++;
                    } else {
                        
                        l--;
                    }
                }
            }
        }
        output.addAll(s);
        return output;
    }
    
    public static void main(String[] args) {
    	
        Solution solution = new Solution();
        
        int[] nums1 = {1, 0, -1, 0, -2, 2};
        int target1 = 0;
        
        List<List<Integer>> result1 = solution.fourSum(nums1, target1);
        
        System.out.println("Example 1:");
        for (List<Integer> quadruplet : result1) {
            System.out.println(quadruplet);
        }

        int[] nums2 = {2, 2, 2, 2, 2};
        int target2 = 8;
        
        List<List<Integer>> result2 = solution.fourSum(nums2, target2);
        
        System.out.println("\nExample 2:");
        for (List<Integer> quadruplet : result2) {
            System.out.println(quadruplet);
        }
    }
}
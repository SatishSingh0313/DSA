package day7;

//Next Permutation

/* A permutation of an array of integers is an arrangement of its members into a sequence or linear order.

For example, for arr = [1,2,3], the following are all the permutations of arr: [1,2,3], [1,3,2], [2, 1, 3], [2, 3, 1], [3,1,2], [3,2,1].
The next permutation of an array of integers is the next lexicographically greater permutation of its integer. 
More formally, if all the permutations of the array are sorted in one container according to their lexicographical order, then the next permutation of that array is the permutation that follows it in the sorted container. If such arrangement is not possible, the array must be rearranged as the lowest possible order (i.e., sorted in ascending order).

For example, the next permutation of arr = [1,2,3] is [1,3,2].
Similarly, the next permutation of arr = [2,3,1] is [3,1,2].
While the next permutation of arr = [3,2,1] is [1,2,3] because [3,2,1] does not have a lexicographical larger rearrangement.
Given an array of integers nums, find the next permutation of nums.

The replacement must be in place and use only constant extra memory.

Example 1:
Input: nums = [1,2,3]
Output: [1,3,2]

Example 2:
Input: nums = [3,2,1]
Output: [1,2,3]

Example 3:
Input: nums = [1,1,5]
Output: [1,5,1] */

class Solution {
    public void nextPermutation(int[] nums) {
        
        int i = nums.length - 2;

        // Find the first pair (i, i+1) such that nums[i] < nums[i+1]
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        if (i >= 0) {
            // Find the smallest element to the right of nums[i] and greater than nums[i]
            int j = nums.length - 1;
            while (nums[j] <= nums[i]) {
                j--;
            }

            // Swap nums[i] and nums[j]
            swap(nums, i, j);
        }

        // Reverse the sequence to the right of nums[i]
        reverse(nums, i + 1);
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private static void reverse(int[] nums, int start) {
        int end = nums.length - 1;
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }
    
    public static void main(String[] args) {
    	
        Solution solution = new Solution();

        // Example 1
        int[] nums1 = {1, 2, 3};
        solution.nextPermutation(nums1);
        System.out.print("Example 1: ");
        printArray(nums1); // Output: [1, 3, 2]

        // Example 2
        int[] nums2 = {3, 2, 1};
        solution.nextPermutation(nums2);
        System.out.print("Example 2: ");
        printArray(nums2); // Output: [1, 2, 3]

        // Example 3
        int[] nums3 = {1, 1, 5};
        solution.nextPermutation(nums3);
        System.out.print("Example 3: ");
        printArray(nums3); // Output: [1, 5, 1]
    }

    // Helper method to print an array
    private static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
package day10;

import java.util.ArrayList;
import java.util.List;

//Pascal's Triangle

/* Given an integer numRows, return the first numRows of Pascal's triangle.

In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:

Example 1:
Input: numRows = 5
Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]

Example 2:
Input: numRows = 1
Output: [[1]] */

class Solution {

    public List<List<Integer>> generate(int numRows) {
    List<List<Integer>> arr = new ArrayList<List<Integer>>();
    arr.add(List.of(1));

    for (int i = 1; i < numRows; i++) {

        List<Integer> li = new ArrayList<>();
        int prev = 1;
        for (int j = 0; j <= i; j++) {
            
            li.add(prev);
            prev = prev * (i - j) / (j + 1);
        }
        arr.add(li);
    }
    return arr;
  }
    
    public static void main(String[] args) {
    	
    	Solution solution = new Solution();
    	
    	int numWows=5;
    	
    	System.out.println("Pascal's Triangle is :"+solution.generate(numWows));
	}
}
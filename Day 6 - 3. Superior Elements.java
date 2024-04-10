package day8;

//Superior Elements

/* Problem statement
There is an integer array ‘a’ of size ‘n’.
An element is called a Superior Element if it is greater than all the elements present to its right.
You must return an array all Superior Elements in the array ‘a’.

Note: The last element of the array is always a Superior Element. 

Example
Input: a = [1, 2, 3, 2], n = 4
Output: 2 3
Explanation: 
a[ 2 ] = 3 is greater than a[ 3 ]. Hence it is a Superior Element. 
a[ 3 ] = 2 is the last element. Hence it is a Superior Element.
The final answer is in sorted order. */

import java.util.*;
public class Solution {
	
    public static List< Integer > superiorElements(int []a) {
        
        List<Integer> result = new ArrayList<>();
        int n = a.length;

        int maxRight = Integer.MIN_VALUE;

        for (int i = n - 1; i >= 0; i--) {
            if (a[i] > maxRight) {
                result.add(a[i]);
                maxRight = a[i];
            }
        }

        Collections.sort(result);
        return result;
    }
    
    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter Array Size");
    	
    	int n = sc.nextInt();
    	
    	System.out.println("Enter "+n+" Elements");
    	
    	int []a = new int[n];
    	
    	for(int i=0; i<n; i++) {
    		
    		a[i] = sc.nextInt();
    	}
    	
//		int a[] = {1, 2, 3, 2};
		
		 List<Integer> superiorElements = Solution.superiorElements(a);
		 
		 System.out.println("Superior Elements is :"+superiorElements);
	}
}
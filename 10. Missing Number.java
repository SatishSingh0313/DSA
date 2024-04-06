package day4;

//Missing Number

/* 
Problem statement:
Given an array ‘a’ of size ‘n’-1 with elements of range 1 to ‘n’. 
The array does not contain any duplicates. Your task is to find the missing number.

Input: 'a' = [1, 2, 4, 5], 'n' = 5
Output : 3
Explanation: 3 is the missing value in the range 1 to 5. */

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Solution {
    public static int missingNumber(int []a, int N) {

        int[] v = new int[N+1];
        Arrays.fill(v, -1);

        for(int i = 0; i < a.length; i++) {

            v[a[i]] = a[i];
        }

        for(int i = 0; i < v.length; i++) {

            if(v[i] == -1) return i;
        }
        return 0;
    }

    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array:");
        
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n - 1; i++) {
            a[i] = sc.nextInt();
            
        }
        System.out.println("Missing number: " + missingNumber(a, n));
    }
}
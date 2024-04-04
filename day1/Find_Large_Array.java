package day1;

//Largest Element in an Array

/*
Problem statement:
Given an array 'Array' of size ‘n’ find the largest element in the array.

Example:
Input: 'n' = 5, 'Array' = [1, 2, 8, 4, 5]
Output: 8

Explanation: From the array {1, 2, 3, 4, 5}, the largest element is 5. */

import java.util.Scanner;

public class Find_Large_Array {

  static int largestElement(int[] arr, int n) {

      int max = Integer.MIN_VALUE;

      for (int i = 0; i < n; i++) {

          if (max < arr[i]) {

              max = arr[i];
          }
      }

      return max;
  }

  public static void main(String[] args) {
	  
	  System.out.println("Enter Array Size");
      Scanner sc = new Scanner(System.in);
      
      int n = sc.nextInt();
      System.out.println("Enter "+n+" Number");
      int arr[] = new int[n];

      for (int i = 0; i < n; i++) {

          arr[i] = sc.nextInt();
      }
   
      System.out.println("Large No :"+largestElement(arr, n));
  }
}

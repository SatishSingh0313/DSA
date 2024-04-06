package day1;

import java.util.Scanner;
//Find Second Smallest and Second Largest Element in an array

/* 
Problem statement:
You have been given an array ‘a’ of ‘n’ unique non-negative integers.
Find the second largest and second smallest element from the array.
Return the two elements (second largest and second smallest) as another array of size 2.

Example :
Input: ‘n’ = 5, ‘a’ = [1, 2, 3, 4, 5]
Output: [4, 2]

The second largest element after 5 is 4, and the second smallest element after 1 is 2. */


public class Solution {

  public static int[] getSecondOrderElements(int n, int[] a) {

      int first_lar = Integer.MIN_VALUE;
      int second_lar = Integer.MIN_VALUE;
      int first_small = Integer.MAX_VALUE;
      int second_small = Integer.MAX_VALUE;

      for (int i = 0; i < n; i++) {

          if (a[i] > first_lar) {

              second_lar = first_lar;
              first_lar = a[i];
          } 
          else if (a[i] > second_lar && a[i] != first_lar) {

              second_lar = a[i];
          }

          if (a[i] < first_small) {

              second_small = first_small;
              first_small = a[i];
          } 
          else if (a[i] < second_small && a[i] != first_small) {

              second_small = a[i];
          }
      }

      return new int[]{second_lar, second_small};
  }

  public static void main(String[] args) {
	  
	  System.out.println("Enter Array Size");
      Scanner sc = new Scanner(System.in);
      
      int n = sc.nextInt();
      System.out.println("Enter "+n+" Number");
      int a[] = new int[n];

      for (int i = 0; i < n; i++) {
          
          a[i] = sc.nextInt();
      }

      int[] result = getSecondOrderElements(n, a);
      System.out.println("Seccond Largest No : "+result[0] + " " +"and Seccond Smallest No: "+ result[1]);
  }
}

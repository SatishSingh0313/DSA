package day13;

//Sub array With Maximum Product

/* Given an array ‘Arr’ that has ‘N’ elements. You have to find the
sub array of ‘Arr’ that has the largest product. 
You must return the product of the sub array with the maximum product.

For example:
When ‘N’ = 5, and ‘Arr’ = {-2, 3, -4, 0}
The sub arrays of ‘Arr’ are:
{-2}, {-2, 3}, {-2, 3, -4}, {-2, 3, -4, 0}, {3}, {3, -4}, {3, -4, 0}, {-4}, {-4, 0}, {0}.
Among these, {-2, 3, -4} is the sub array having the maximum product equal to 24.
Hence, the answer is 24.*/

public class Solution {
	
    public static int subarrayWithMaxProduct(int []arr){
        
        if (arr == null || arr.length == 0) {

            return 0;
        }

        int maxProduct = arr[0];
        int minProduct = arr[0];
        int result = arr[0];

        for (int i = 1; i < arr.length; i++) {
            
            if (arr[i] < 0) {
                
                int temp = maxProduct;
                maxProduct = minProduct;
                minProduct = temp;
            }

            maxProduct = Math.max(arr[i], maxProduct * arr[i]);
            minProduct = Math.min(arr[i], minProduct * arr[i]);

            result = Math.max(result, maxProduct);
        }

        return result;
    }
    
    public static void main(String[] args) {
    	
        int[] arr1 = {-2, 3, -4, 0};
        int[] arr2 = {2, 3, -2, 4};
        int[] arr3 = {1, -2, 3, -4, 5, -6, 7};
        
        System.out.println("Maximum product of sub array in arr1: " + subarrayWithMaxProduct(arr1));
        System.out.println("Maximum product of sub array in arr2: " + subarrayWithMaxProduct(arr2));
        System.out.println("Maximum product of sub array in arr3: " + subarrayWithMaxProduct(arr3));
    }
}
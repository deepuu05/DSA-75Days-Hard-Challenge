// Java code to implement the approach

import java.io.*;
import java.util.*; 
 
class CountOfSubarray
{
    // Function to find the minimum element in a given range
    public static int min_element(int arr[], int left, int right)
    {
        int x = Integer.MAX_VALUE;
        for(int i=left;i<right;i++)
        {
            x=Math.min(x,arr[i]);
        }
        return x;
    }
    
    // Function to find all subarrays with first
    // element not bigger than other elements
    public static int countSubarrays(int arr[])
    {
        int n = arr.length;
        
        int cnt = n;
        
        // Two loops to find the
        // ending of each subarrays
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                // Minimum element from
                // [start+1, end] of each subarray
                int mini_ele = min_element(arr,i+1,j+1);
                if (mini_ele >= arr[i])
                cnt++;
            }
        }
        
        return cnt;
    }
    
    // Driver Code
    public static void main(String[] args)
    {
        int arr[] = {1, 3, 5, 2};
        
        // Function call
        System.out.println(countSubarrays(arr) );
    }
}


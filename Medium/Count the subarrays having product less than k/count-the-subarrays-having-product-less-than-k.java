//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;


class GFG {
	public static void main(String[] args) throws IOException
	{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            StringTokenizer stt = new StringTokenizer(br.readLine());
            
            int n = Integer.parseInt(stt.nextToken());
            long k = Long.parseLong(stt.nextToken());
            
            long a[] = new long[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            
            Solution obj = new Solution();
            out.println(obj.countSubArrayProductLessThanK(a, n, k));
        }
        out.close();
	}
}


// } Driver Code Ends


//User function Template for Java


class Solution {
    
    public long countSubArrayProductLessThanK(long nums[], int n, long k)
    {
    //      long count=0;
    //   // int n=nums.length;
    //     for(int i=0;i<n;i++)
    //     {    long prod =1;
    //         for(int j=i;j<n;j++)
    //         {
    //             prod *=nums[j];
    //             if(prod<k)count++;
    //             if(prod > k) break;
    //         }
    //     }
    //     return count;
    
    
    //sliding window approch
    
    long count=0;
    int z=nums.length;
    int i=0,j=0;
    long prod =1;
    while(j<z)
    {
         prod *=nums[j];
        
        while(prod >=k && i<=j)
        {
            prod /=nums[i];
            i++;
        }
        count += (j-i+1);
        j++;
    }
    return count;
    }
}